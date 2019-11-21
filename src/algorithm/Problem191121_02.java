package algorithm;

import java.util.Arrays;

public class Problem191121_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 오버플로우 및 이분탐색에 대한 완벽한 코드상 구현
	public long solution(int n, int[] times) {
		Arrays.sort(times);
		long answer = 0;
		long start = 0;

		long end = (long) times[times.length - 1] * n;
		long[] longTimes = new long[times.length];
		for (int i = 0; i < times.length; i++) {
			longTimes[i] = times[i];
			// System.out.println((long)times[i]);
		}

		while (start <= end) {
			long mid = (start + end) / 2;
			// System.out.println(start+" "+mid+" "+end);
			long people = n;
			for (long time : longTimes) {
				people -= mid / time;
			}
			if (people > 0) {
				start = mid + 1;
			} else {
				end = mid - 1;
				answer = mid;
			}

		}

		return answer;
	}

	
}
