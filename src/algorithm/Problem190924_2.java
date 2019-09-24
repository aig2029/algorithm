package algorithm;

import java.util.Scanner;

public class Problem190924_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int input=0,result=0;
			for (int j = 0; j < 10; j++) {
				input=sc.nextInt();
				result+=input;
			}
			result=(int)Math.round((double)result/10);
			System.out.println("#"+(i+1)+" "+result);
		}
	}

}
