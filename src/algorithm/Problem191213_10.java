package algorithm;

import java.util.HashMap;

public class Problem191213_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
        
        if(A.length==0) return -1;
        
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max=1;
        for(int a : A){
            if(!hm.containsKey(a)) hm.put(a,1);
            else {
                hm.put(a, hm.get(a)+1);
                if(max<hm.get(a)) max=hm.get(a);
            }
        }
        // System.out.println(max);
        if(max<=A.length/2) {
            // System.out.println("zzz");   
            return -1;
        }
        
        System.out.println(max);
        
        int dominator = 0;
        
        for(int key : hm.keySet()){
            if(max==hm.get(key)){
                dominator = key;
            }
        }
        
        for(int i=0; i<A.length; i++){
            if(A[i]==dominator) return i;
        }
        
        return -1;
    }

	
}
