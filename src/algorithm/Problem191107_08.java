package algorithm;

import java.util.HashSet;

public class Problem191107_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] nums) {
        int answer = 0;
        
        
        HashSet<Integer> hs = new HashSet<>();
        
        
        for(int i=0; i<nums.length; i++){
            // System.out.println(nums[i]);
            hs.add(nums[i]);
        }
        // System.out.println();
        
        // Iterator<Integer> it = hs.iterator();
        // while(it.hasNext()){
        //      System.out.println(it.next());
        // }
        
        // System.out.println(hs.size());
        
        int choiceNum = nums.length/2;
        
        if(choiceNum>=hs.size()) return hs.size();
        else return choiceNum;
        
    
    }

	
}
