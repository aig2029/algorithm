package algorithm;

import java.util.Arrays;

public class Problem191019_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n) {
	      int answer = 0;
	      boolean[] sosu = new boolean[n+1];
	      Arrays.fill(sosu,true);
	      for(int i=2; i<=n; i++){
	          if(sosu[i]==true){
	              for(int j=2;j*i<=n;j++){
	                  sosu[i*j]=false;
	              }    
	          }
	      }
	      for(int i=2;i<=n;i++){
	          if(sosu[i]) answer++;
	      }
	      return answer;
	  }

}
