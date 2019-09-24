package algorithm;

import java.util.Scanner;

public class Problem190925_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int max = 0;
			for (int j = 0; j < 10; j++) {
				int input = sc.nextInt();
				if(max<input) max=input;
			}
			System.out.println("#"+(i+1)+" "+max);
		}
	}

}
