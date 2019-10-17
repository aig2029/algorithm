package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Problem191017_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        
        
        for (int i = 0; i < commands.length; i++) {
        	int firIdx = commands[i][0];
        	int lastIdx = commands[i][1];
        	int nTh = commands[i][2];
        	
        	ArrayList<Integer> arr = new ArrayList<>();
        	
        	for(int j=firIdx-1; j<=lastIdx-1; j++) {
        		arr.add(array[j]);
        	}
        	
        	Collections.sort(arr);
        	
        	System.out.println(arr);
            System.out.println(arr.get(nTh-1));
            
            answer[i]=arr.get(nTh-1);
		}
        
        
        return answer;
    }
}
