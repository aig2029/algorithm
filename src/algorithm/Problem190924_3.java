package algorithm;

import java.util.Scanner;

public class Problem190924_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String res="";
			
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if(a>b) res=">";
				else if(a==b) res="=";
				else res="<";
//				System.out.println(a+" "+b);
				
			
			System.out.println("#"+(i+1)+" "+res);
		}
	}

}
