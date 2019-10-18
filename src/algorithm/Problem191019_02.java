package algorithm;

public class Problem191019_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(int n) {
	      
	      
	      String answer = "";
	      for(int i=0; i<n; i++) {
				if(i%2==0) {
					answer+="수";
				}
				else answer+="박";
	          // answer.concat("수");
			}
	      return answer;
	  }

}
