package algorithm;

import java.util.Scanner;

public class Problem191110_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if(N==1 && M==1) System.out.println(0);
		else System.out.println( (N-1)+(M-1)*N); 		
		
	}
	
	

	
}
