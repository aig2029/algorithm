package algorithm;

import java.util.Arrays;

public class Problem191118_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] budgets, int M) {
		int answer = 0;

		Arrays.sort(budgets);

		long sum = 0;
		int leng = budgets.length;

		for (int i : budgets)
			sum += i;
		if (sum <= M)
			return budgets[leng - 1];

		int min = 0;
		int max = budgets[leng - 1];
		long exSum = -1;
		int mid;

		while (true) {
			sum = 0;
			mid = (max + min) / 2;

			for (int i = 0; i < leng; i++) {
				if (budgets[i] < mid)
					sum += budgets[i];
				else {
					sum += (mid * (leng - i));
					break;
				}
			}
			if (exSum == sum)
				break;
			if (sum < M)
				min = mid;
			else if (sum > M)
				max = mid;
			exSum = sum;

		}
		answer = mid;
		return answer;
	}

	
}
