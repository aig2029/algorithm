package algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Problem191018_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String[] solution(String[] strings, int n) {
	    
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.charAt(n)>o2.charAt(n)) return 1;
				else if(o1.charAt(n)<o2.charAt(n)) return -1;
				else return o1.compareTo(o2); 
			}
			
		});
		
		return strings;
  
	}

}
