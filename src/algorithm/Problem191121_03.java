package algorithm;

public class Problem191121_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static int[][] triangle;
	static int[][] dp;

	public int solution(int[][] triangleInput) {
		triangle = triangleInput;
		int answer = 0;
		dp = new int[triangle.length][triangle.length];
		dp[0][0] = triangle[0][0];

		for (int i = 1; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				DP(i, j);
				// System.out.print(triangle[i][j]+" ");
			}
			System.out.println();
		}

		//         System.out.println();
		//         for(int i=1; i<dp.length; i++){
		//             for(int j=0; j<dp[i].length; j++){
		//                 System.out.print(dp[i][j]+" ");
		//             }
		//             System.out.println();
		//         }

		for (int i = 0; i < dp.length; i++) {
			answer = Math.max(answer, dp[dp.length - 1][i]);
		}

		return answer;
	}

	void DP(int i, int j) {
		dp[i][j] = triangle[i][j];
		if (j == 0)
			dp[i][j] += dp[i - 1][j];
		else if (j == triangle[i].length - 1)
			dp[i][j] += dp[i - 1][j - 1];
		else {
			dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
		}

	}

	
}
