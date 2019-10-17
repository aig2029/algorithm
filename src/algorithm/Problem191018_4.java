package algorithm;

public class Problem191018_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public long solution(int a, int b) {
	      long answer = 0;
	      int temp;
	      if(a>b) {
	          temp=a;
	          a=b;
	          b=temp;
	      }
	      for(int i=a;i<=b;i++){
	          answer+=i;
	      }
	      return answer;
	  }

}
