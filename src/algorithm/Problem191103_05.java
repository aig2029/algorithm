package algorithm;

import java.util.Scanner;

public class Problem191103_05 {

	static int N;
	static int ans=0;
	static int[] col;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			col = new int[16];
			col[1]=i;
				 //행,열
			nQueen(i,1);
		}
		System.out.println(ans);
		
	}
	// x=col[y]
	private static void nQueen(int x, int y) {
		for(int k=1; k<y; k++) {
			if(col[k]==col[y] || (y-k)==Math.abs(x-col[k])) return;
		}
		
		if(y==N) {
			ans++;
			return ;
		}
		
		for(int k=1; k<=N; k++) {
			col[y+1]=k;
			nQueen(k,y+1);
		}
	}

	
}
