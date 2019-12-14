package algorithm;

import java.util.HashSet;

public class Problem191214_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(31,22));
	}
	
	static int[] rowArr;
	static int n;
	static int k;
	static int answer;
	static HashSet<String> hs;
	
	public static int solution(int nInput, int kInput) {
		n=nInput;
		k=kInput;
		
		if(n<k) {
			System.out.println("z");
			return 0;
		}
		
		long ncr = nCr(n,k);
		long npr = nPr(n,k);
		System.out.println(ncr);
		System.out.println(npr);
		System.out.println(ncr*npr);
		
		int res=(int)(((ncr%10007)*(npr%10007))%10007);
		
		return res;
	}
	
	static long nPr(int n, int r) {
        long res = 1;
        if(n==r) return 1;
        for(long i=n; i>n-r; i--) res *= i;
        return res;
    }
	static long nCr(int n, int r){
		if( r > n ) return -1;
		if( r == 0 ) return 1;
		if( n == r ) return 1;
		if( n-r<r ) r=n-r;
		long res = 1;
		for(int i=1; i<=r; i++) res = res*(n-i+1)/i;
		return res;
	}

	

	
}
