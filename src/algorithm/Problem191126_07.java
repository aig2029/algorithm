package algorithm;

public class Problem191126_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	
	public long solution(int n) {
		long answer = 1;
		long a = 1, b = 2;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		// long dp[] = new long[n+1];
		// dp[1]=1;
		// dp[2]=2;

		for (int i = 3; i <= n; i++) {
			// dp[i] = (dp[i-2] + dp[i-1])%1234567;
			answer = (a + b) % 1234567;
			a = b;
			b = answer;
		}
		// answer=dp[n]%1234567;

		return answer;
	}
	
}
