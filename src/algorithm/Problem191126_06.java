package algorithm;

public class Problem191126_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n, int[] money) {
		int answer = 0;
		long[] dp = new long[n + 1];
		dp[0] = 1;
		for (int i = 0; i <= n; i++) {
			if (i % money[0] == 0)
				dp[i] = 1;
		}

		// for(long i : dp){
		//     System.out.print(i+" ");
		// }
		// System.out.println();

		for (int i = 1; i < money.length; i++) {
			for (int j = money[i]; j <= n; j++) {
				dp[j] = (dp[j] + dp[j - money[i]]) % 1000000007;
				// System.out.println(dp[j]);
			}
			// for(long k : dp){
			//     System.out.print(k+" ");
			// }
			// System.out.println();
		}

		return (int) (dp[n] % 1000000007);
	}

	
}
