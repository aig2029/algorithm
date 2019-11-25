package algorithm;

public class Problem191124_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int m, int n, int[][] puddlesInput) {
		int answer = 0;

		boolean[][] puddles = new boolean[n + 1][m + 1];

		for (int i = 0; i < puddlesInput.length; i++) {
			puddles[puddlesInput[i][1]][puddlesInput[i][0]] = true;
			// System.out.println(puddlesInput[i][0]+" "+puddlesInput[i][1]);
		}

		int[][] dp = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == 1 && j == 1)
					dp[i][j] = 1;
				else if (puddles[i][j])
					dp[i][j] = 0;
				else
					dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
				// System.out.print(dp[i][j]+" ");
			}
			// System.out.println();
		}
		return dp[n][m];
	}

	
}
