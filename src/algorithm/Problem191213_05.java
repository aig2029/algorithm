package algorithm;

import java.util.Arrays;

public class Problem191213_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length<=2) return 0;
        
        Arrays.sort(A);
        
        // for(int a : A ) System.out.println(a);
        
        for(int i=A.length-1; i>=2; i--){
            if(A[i-1]>A[i-2]-A[i] && A[i-2]>A[i]-A[i-1] && A[i]>A[i-1]-A[i-2]) return 1;
            
        }
        return 0;
    }

	
}
