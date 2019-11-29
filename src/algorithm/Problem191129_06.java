package algorithm;

import java.util.Arrays;

public class Problem191129_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		int[] rest = new int[n + 2];
		Arrays.fill(rest, 1);
		rest[0] = rest[n + 1] = 0;

		for (int i = 0; i < lost.length; i++) {
			rest[lost[i]]--;
		}
		for (int i = 0; i < reserve.length; i++) {
			rest[reserve[i]]++;
		}

		for (int i = 1; i <= n; i++) {
			if (rest[i] == 0) {
				if (rest[i - 1] == 2) {
					rest[i - 1]--;
					rest[i]++;
				} else if (rest[i + 1] == 2) {
					rest[i + 1]--;
					rest[i]++;
				}
			}
			if (rest[i] >= 1)
				answer++;
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(rest[i]);
		}

		return answer;
	}

	
}
