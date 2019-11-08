package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Problem191107_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(String s) {
	      String answer = "";
	      String[] spl = s.split(" ");
	      
	      ArrayList<Integer> arrList = new ArrayList<>();
	      
	      for(int i=0; i<spl.length; i++){
	          // System.out.println(spl[i]);
	          if(spl[i].substring(0,1)!="-") {
	              arrList.add(Integer.parseInt(spl[i]));
	          }
	          else {
	              int num = Integer.parseInt(spl[i].substring(1));
	              arrList.add(-num);
	          }
	      }
	      
	      Collections.sort(arrList);
	      
	      // System.out.println();
	      // System.out.println(arrList.size());
	      // Iterator<Integer> it = arrList.iterator();
	      // while(it.hasNext()){
	      //     System.out.println(it.next());
	      // }
	      answer= Integer.toString(arrList.get(0))+" "+Integer.toString(arrList.get(arrList.size()-1));
	      
	      return answer;
	  }
	
	

	
}
