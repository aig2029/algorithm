package algorithm;

import java.util.Scanner;

public class Problem191017_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res=0;
//		System.out.println(N%10);
		while(N!=0) {
			res+=(N%10);
			N/=10;
		}
		System.out.println(res);
	}
}
