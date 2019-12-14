package algorithm;

import java.util.HashSet;

public class Problem191214_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(3,2));
	}

	static int[] rowArr;
	static int n;
	static int k;
	static int answer;
	static HashSet<String> hs;

	public static int solution(int nInput, int kInput) {
		
		//nCk(col고르기) * nPk 
		answer = 0;

		n = nInput;
		k = kInput;
		rowArr = new int[n + 1];
		hs = new HashSet<>();

		if (n * n < k)
			return 0;

		for (int row = 1; row <= n; row++) {
			rowArr[1] = row;
			k--;

			N_Rock(1);

			rowArr[1] = 0;
			k++;
		}

		N_Rock(1);

		return answer % 10007;

	}

	static void N_Rock(int currentCol) {
		for (int j = 1; j < currentCol; j++) {

			if (rowArr[j] == rowArr[currentCol]) {
				 for(int i=1; i<=n; i++){
				 System.out.print(rowArr[i]+" ");
				 }   
				 System.out.println();
				return;
			}
		}
		if (k == 0) {
			 System.out.print("합격 : ");
			 for(int i=1; i<=n; i++){
			     System.out.print(rowArr[i]+" ");
			 }   
			 System.out.println();
			answer++;
		}
		if (currentCol == n)
			return;

		for (int row = 1; row <= n; row++) {
			rowArr[currentCol + 1] = row;
			k--;
			N_Rock(currentCol + 1);

			rowArr[currentCol + 1] = 0;
			k++;

		}
		N_Rock(currentCol + 1);
	}

	
}
