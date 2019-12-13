package algorithm;

import java.util.Scanner;

public class Problem191213_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int answer=0;
		
		boolean[][] map = new boolean[N][M];
		
		for(int j=0; j<M; j++) {
			
			int input = sc.nextInt();
			for(int i=0; i<input; i++) {
				map[i][j]=true;
			}
		}
		
		for(int i=0; i<N; i++) {
			Loop2 : for(int j=0; j<M; j++) {
				if (!map[i][j]) {
					int pre = j;
					while(pre>=0) {
						if(map[i][pre]) break;
						if(pre==0) continue Loop2;
						pre--;
					}
					pre=j;
					while(pre<M) {
						if(map[i][pre]) break;
						if(pre==M-1) continue Loop2;
						pre++;
					}
					answer++;
				}
			}
		}
		System.out.println(answer);
	}

	
}
