package algorithm;

import java.util.Arrays;

public class Problem191118_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 틀린 코드.. 이분탐색으로 못함
	public int solution(int[] budgets, int M) {
		int answer = 0;

		Arrays.sort(budgets);
		// for(int i=0; i<budgets.length; i++){
		//     System.out.println(budgets[i]);
		// }
		// System.out.println();

		for (int max = budgets[0]; max <= budgets[budgets.length - 1]; max++) {
			int sum = 0;
			// System.out.println(max);
			for (int i = 0; i < budgets.length; i++) {
				if (budgets[i] <= max) {
					sum += budgets[i];

				} else {
					sum += (max * (budgets.length - i));

					break;
				}
			}
			if (sum > answer && sum <= M)
				answer = max;
			if (sum > M)
				break;

			// System.out.println(sum);
			// System.out.println();

		}

		return answer;
	}

	
}
