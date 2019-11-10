package algorithm;

import java.util.Scanner;

public class Problem191110_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] point = new int[N+1];
		
		int[] unspareDp = new int[N+1];
		int[] spareDp = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			point[i] = sc.nextInt();
//			System.out.println(point[i]);
		}
		unspareDp[1]=point[1];
		unspareDp[2]=unspareDp[1]+point[2];
		spareDp[2]=point[2];
		spareDp[1]=point[1];
		for(int i=3; i<=N; i++) {
			unspareDp[i]=point[i]+spareDp[i-1];
			spareDp[i]=point[i]+Math.max(unspareDp[i-2],spareDp[i-2]);
		}
		System.out.println(Math.max(unspareDp[N],spareDp[N]));
		
		
		
	}

	
}
