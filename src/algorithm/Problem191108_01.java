package algorithm;

public class Problem191108_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n) {
	      int answer = 0;
	      
	      int[] dp = new int[1000001];
	      dp[0]=0;
	      dp[1]=1;
	      
	      for(int i=2; i<=n; i++){
	          dp[i]=(dp[i-1]+dp[i-2])%1234567;
	      }
	      
//	       for(int i=0; i<=n; i++){
	          
//	           System.out.println(dp[i]);    
//	       }
//	       System.out.println(dp[n]);
	     
	      
	      return dp[n];
	  }

	
}
