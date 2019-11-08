package algorithm;

public class Problem191107_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n) {
	      int answer = 0;
	      int a=0;
	      int b=0;
	      
	      for(int i=1; i<=n; i++){
	          
	          int num=i;
	          int total=0;
	          while(true){
	              total+=num++;
	              if(total==n) {
	                  answer++;
	                  break;
	              }
	              else if(total>n){
	                  break;
	              }
	          }
	      }
	      
	      
	      return answer;
	  }

	
}
