package algorithm;

public class Problem191019_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String s) {
	      int answer = 0;
	      
	      if(s.charAt(0)=='-'){
	          int unit=1;
	          for(int i=s.length()-1; i>=1 ;i--){
	              answer-=unit*(s.charAt(i)-'0');   
	              unit*=10;
	          }
	      }
	      else if (s.charAt(0)=='+'){
	          int unit=1;
	          for(int i=s.length()-1; i>=1 ;i--){
	              answer+=unit*(s.charAt(i)-'0');   
	              unit*=10;
	          }
	      }
	      else {
	          int unit=1;
	          for(int i=s.length()-1; i>=0 ;i--){
	              answer+=unit*(s.charAt(i)-'0');   
	              unit*=10;
	          }
	      }
	      
	      return answer;
	  }
	
}
