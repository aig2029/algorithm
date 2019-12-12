package algorithm;

import java.util.HashSet;

public class Problem191213_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> hs = new HashSet<>();
        
        for(int a : A) hs.add(a);
        
        return hs.size();
    }

	
}
