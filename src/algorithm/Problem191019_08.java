package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Problem191019_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public long solution(long n) {
	      long answer = 0;

	      ArrayList<Integer> arr = new ArrayList<>();
	      while(n!=0){
	          arr.add((int)(n%10));
	          n=(long)(n/10);
	      }
	      
	      Collections.sort(arr);
	      
	      long unit=1;
	      for(int i=0; i<arr.size(); i++){
	          System.out.println(arr.get(i));
	          answer+=(unit*arr.get(i));
	          unit*=10;
	      }
	      
	      
	      return answer;
	  }
}
