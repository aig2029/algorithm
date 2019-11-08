package algorithm;

import java.util.Scanner;

public class Problem191107_07 {

	static int N;
	static int answer=0;
	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		
		for(int i=1; i<=N; i++) {
			arr = new int[16];
			arr[1]=i;
			nqueen(1);
		}
		
		System.out.println(answer);
		
	}
	
	static void nqueen(int y) {
		for(int k=1; k<y; k++) {
			if(arr[k]==arr[y] || (y-k)==Math.abs(arr[k]-arr[y])) {
				return;
			}
		}
		
		if(y==N) {
			answer++;
//			for(int i=1; i<=N; i++) {
//				System.out.print(arr[i]+" ");
//			}
//			System.out.println();
			return;
		}
		
		for(int k=1; k<=N; k++) {
			arr[y+1]=k;
//			System.out.println("y+1"+(y+1));
//			System.out.println("arr[y+1]"+arr[y+1]);
			nqueen(y+1);
		}
		

		
	}

	
}
