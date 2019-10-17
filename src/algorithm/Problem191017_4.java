package algorithm;

import java.util.HashMap;

public class Problem191017_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//solution(participant, completion);
		
		
	}
	
	
    public static String solution(String[] participant, String[] completion) {
    	String answer = "";
        HashMap<String,Integer> parti = new HashMap<String,Integer>();
		for (String string : participant) {
			//System.out.println(string);
			
			if(parti.containsKey(string)) {
				parti.put(string, parti.get(string)+1);
			}
			else parti.put(string, 1);
		}
        
        //System.out.println();
		
		for (String string : completion) {
			//System.out.println(string);
			
			parti.put(string, parti.get(string)-1);
			if(parti.get(string)==0) {
				parti.remove(string);
			}
		}
        
        //System.out.println();
		
		for (String string : parti.keySet()) {
			answer=string;
            System.out.println(string);
		}
        
        
        
        return answer;
    }


}
