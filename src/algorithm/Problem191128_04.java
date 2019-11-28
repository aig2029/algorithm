package algorithm;

import java.util.Arrays;

public class Problem191128_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public long solution(int nInput, int[] timesInput) {
		long answer = Long.MAX_VALUE;

		long n = (long) nInput;

		long[] times = new long[timesInput.length];
		for (int i = 0; i < times.length; i++) {
			times[i] = (long) timesInput[i];
			// System.out.println((long)times[i]);
		}

		Arrays.sort(times);

		long start = 0;
		long end = times[times.length - 1] * n;
		long mid = 0;
		long exMid = -1;
		long exSum = -1;

		long sum = 0;

		// for(int i=0; i<times.length; i++){
		//     System.out.println(times[i]);
		// }

		long zeroRestNum = 0;

		while (true) {
			sum = 0;
			mid = (start + end) / 2;
			zeroRestNum = 0;

			if (exMid == mid)
				break;

			// System.out.println("min mid max");
			// System.out.println(min + " " + mid + " " + max);

			// 여기 떄문이었다. foreach문써주지말고 이렇게 i=0인부분을 제외하고 zeroRestNum을 추가해줘야햇다.
			for (int i = 0; i < times.length; i++) {
				sum += (mid / times[i]);
				if (i != 0 && mid % times[i] == 0)
					zeroRestNum++;
			}

			if (sum >= n) {
				end = mid;
				// answer=mid; // 개인적으로 제일 납득 안되는 부분..
			} else
				start = mid;

			// System.out.println(zeroRestNum);
			if (sum >= n && sum - zeroRestNum <= n) {
				if (answer > mid)
					answer = mid;
			}
			// System.out.println(sum);

			exMid = mid;
		}

		return answer;
	}

	
}
