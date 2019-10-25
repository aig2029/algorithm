package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Problem191025_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 시간 엄청 날렸는데 진짜 쉬운 것이었음.. 
	public int solution(int[] citations) {
        int answer = 0;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<citations.length; i++){
            arr.add(citations[i]);
        }
        
        Collections.sort(arr);
        Collections.reverse(arr);
        
        for(int i=0; i<arr.size(); i++){
            // System.out.println(arr.get(i));
            if(i+1>=arr.get(i)) break;
            answer++;
        }
        
        
        return answer;
    }
	
	

	
}
