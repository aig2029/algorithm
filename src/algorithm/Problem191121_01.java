package algorithm;

import java.util.Arrays;

public class Problem191121_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 실패
	public long solution(int n, int[] times) {
		long answer = Integer.MAX_VALUE;

		Arrays.sort(times);

		for (int i : times) {
			System.out.println(i);
		}

		int k = (n % times.length == 0) ? n / times.length : n / times.length + 1;
		int min = times[0] * k;
		int max = times[times.length - 1] * k;
		int mid;
		int sum;
		int exMid = -1;

		// if(times.length>=n) return times[n-1];

		while (true) {
			sum = 0;
			mid = (max + min) / 2;

			for (int i = 0; i < times.length; i++) {
				sum += (mid / times[i]);
			}

			System.out.println(min + " " + mid + " " + max);
			System.out.println(sum);

			if (sum < n)
				min = mid;
			if (sum > n)
				max = mid;
			if (sum == n && mid < answer)
				answer = mid;

			if (exMid == mid)
				break;
			exMid = mid;
		}

		return answer;
	}
	
	// 실패2
	public long solution1(int n, int[] times) {
		long answer = Integer.MAX_VALUE;

		Arrays.sort(times);

		for (int i : times) {
			// System.out.println(i);
		}

		int min = 0;
		int max = times[times.length - 1] * n;
		int mid = 0;
		int sum = 0;
		int exMid = -1;
		int maxNum = 0;

		int m = 0;
		Loop1: while (true) {
			sum = 0;
			maxNum = 0;
			mid = (max + min) / 2;

			for (int i = 0; i < times.length; i++) {
				sum += (mid / times[i]);
				if (mid % times[i] == 0)
					maxNum++;
			}
			// System.out.println();
			// System.out.println("min"+" "+"mid"+" "+"max");
			// System.out.println(min+" "+mid+" "+max);
			// System.out.println("sum");
			// System.out.println(sum);

			if (sum < n)
				min = mid;
			if (sum >= n)
				max = mid;
			if (((sum >= n && sum - (maxNum - 1) <= n) || sum == n) && mid < answer) {
				// System.out.println("조건을 만족합니다..");
				answer = mid;

				while (true) {
					sum = 0;
					maxNum = 0;
					mid--;
					for (int j = 0; j < times.length; j++) {
						sum += (mid / times[j]);
						if (mid % times[j] == 0)
							maxNum++;
					}

					// System.out.println("mid");
					// System.out.println(mid);
					// System.out.println("sum");
					// System.out.println(sum);
					if (((sum >= n && sum - (maxNum - 1) <= n) || sum == n) && mid < answer) {
						// System.out.println("조건을 만족합니다..");
						answer = mid;
					} else
						break Loop1;
				}

			}

			if (exMid == mid)
				break;
			exMid = mid;

		}

		return answer;
	}

	
}
