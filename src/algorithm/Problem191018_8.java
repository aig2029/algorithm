package algorithm;

public class Problem191018_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean solution(String s) {
	      boolean answer = true;
	      
	      if(s.length()==4 || s.length()==6){
	        for(int i=0; i<s.length(); i++){
	            if( !('0'<=s.charAt(i) && s.charAt(i)<='9')){
	                return false;
	            }
	        }    
	      }
	      else return false;
	      
	      return true;
	      
	  }

}
