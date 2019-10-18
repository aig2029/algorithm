package algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Problem191018_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(String s) {
	      String[] answer = s.split("");
	      
	      Arrays.sort(answer,Comparator.reverseOrder());
	      
	      return String.join("",answer);
	  }

}
