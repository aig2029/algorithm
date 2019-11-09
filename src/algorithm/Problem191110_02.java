package algorithm;

import java.util.Scanner;

public class Problem191110_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] dp = new int[n];
		dp[0]=sc.nextInt();
		
		int max=-1001;
		if(dp[0]>max) max=dp[0];
		
		for(int i=1; i<n; i++) {
			int input = sc.nextInt();
			dp[i]=(dp[i-1]+input>input)? dp[i-1]+input:input;
			if(dp[i]>max) max=dp[i];
		}
		System.out.println(max);
		
	}

	
}
