package algorithm;

import java.util.Scanner;

public class Problem191124_02 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int answer=0;
		int N=sc.nextInt();
		boolean[][] taller = new boolean[N+1][N+1];
		
		int M=sc.nextInt();
		for(int i=0; i<M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			taller[a][b] = true;
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				for(int k=1; k<=N; k++) {
					if(taller[j][i] && taller[i][k]) {
						taller[j][k]=true;
					}
				}
			}
		}
		
		for(int i=1; i<=N; i++) {
			int passNum=0;
			for(int j=1; j<=N; j++) {
				if( taller[i][j] || taller[j][i] ) {
					passNum++;
				}
			}
			if(passNum == N-1) answer++;
		}
		
		System.out.println(answer);
	}

	
}
