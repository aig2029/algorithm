package algorithm;

import java.util.Arrays;

public class Problem191213_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
        
        Arrays.sort(A);
        
        int leng = A.length;
        
        // for(int a : A ) System.out.println(a);
        int mmp = A[0]*A[1]*A[leng-1];
        int ppp = A[leng-1]*A[leng-2]*A[leng-3];
        
        return (mmp>ppp)?mmp:ppp;
        
        
        
        
    }

	
}
