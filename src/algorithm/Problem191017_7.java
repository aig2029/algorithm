package algorithm;

import java.util.Scanner;

public class Problem191017_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner (System.in);
		int N = sc.nextInt();
		if(N==2) {
			System.out.println("NO");
		}
		else if(N%2==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
