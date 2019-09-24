package algorithm;

import java.util.Scanner;

public class Problem190924_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int unit=0;
			int result=0;
			for (int j = 0; j < 10; j++) {
				unit = sc.nextInt();
				
				if(unit%2==1) result+=unit;
			}
			System.out.println("#"+(i+1)+" "+result);
		}
	}

}
