package algorithm;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem191103_02 {

	final static int MAX_SIZE = 1001;
	static int[] dx = { -1, 1, 0, 0};
	static int[] dy = { 0, 0, -1, 1};
	
	
	static int M;
	static int N;
	static int[][] tomato = new int [MAX_SIZE][MAX_SIZE];
	static int[][] tomatoDays = new int [MAX_SIZE][MAX_SIZE];
	static boolean[][] visited;
	static int ans=0;
	static Queue<Point> q = new LinkedList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		
		
		for(int i=1; i<=N ; i++) {
			for(int j=1; j<=M; j++) {
				tomato[i][j] = sc.nextInt();
//				System.out.print(tomato[i][j]+" ");
			}
//			System.out.println();
		}
		
		for(int i=1; i<=N ; i++) {
			for(int j=1; j<=M; j++) {
				if(tomato[i][j]==0) BFS(i,j);
			}
		}
		
//		System.out.println();
//		for(int i=1; i<=N ; i++) {
//			for(int j=1; j<=M; j++) {
//				System.out.print(tomatoDays[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M; j++) {
				if(tomatoDays[i][j]>ans) ans=tomatoDays[i][j];
				
				if(tomato[i][j]==0 && tomatoDays[i][j]==0) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(ans);
		
	}
	
	static void BFS(int i, int j) {
		visited = new boolean[MAX_SIZE][MAX_SIZE];
		int[][] days = new int[MAX_SIZE][MAX_SIZE];
		
		visited[i][j]=true;
		
		
		q.offer(new Point(i,j));
		
		
		Loop: while(!q.isEmpty()) {
			Point now = q.poll();
			int x = now.x;
			int y = now.y;
			
			for(int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				
				if(nx>=1 && nx<=N && ny>=1 && ny<=M) {
					if(!visited[nx][ny] && tomato[nx][ny]!=-1) {
						q.offer(new Point(nx,ny));
						visited[nx][ny] = true;
						
						days[nx][ny] = days[x][y]+1;
						if(tomato[nx][ny]==1) {
							tomatoDays[i][j] = days[nx][ny];
							if(ans<days[nx][ny]) ans = days[nx][ny];
							break Loop;
						}
					}
				}
			}
		}
	}

	
}
