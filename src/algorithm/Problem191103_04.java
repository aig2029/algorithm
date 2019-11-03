package algorithm;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem191103_04 {

	final static int MAX_SIZE = 1001;
	static int[][] tomato = new int[MAX_SIZE][MAX_SIZE];
	static Queue<Point> q = new LinkedList<>();
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	static int N;
	static int M;
	
	static boolean[][] visited = new boolean[MAX_SIZE][MAX_SIZE];
	static int[][] dist = new int[MAX_SIZE][MAX_SIZE];
	
	static int ans = 0;
	
	// 토마토 복습.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M; j++) {
				tomato[i][j] = sc.nextInt();
//				System.out.print(tomato[i][j]+" ");
				
				if(tomato[i][j]==1) q.offer(new Point(i,j));
			}
//			System.out.println();
		}
		
		BFS();
		
//		System.out.println();
//		for(int i=1; i<=N; i++) {
//			for(int j=1; j<=M; j++) {
//				System.out.print(dist[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M; j++) {
				if(tomato[i][j]==0 && !visited[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(ans);
		
	}
	
	static void BFS() {
		
		while(!q.isEmpty()) {
			Point now = q.poll();
			int x = now.x;
			int y = now.y;
			
			visited[x][y]=true;
			
			for(int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				
				if(nx>=1 && nx<=N && ny>=1 && ny<=M) {
					if(!visited[nx][ny] && tomato[nx][ny]==0) {
						dist[nx][ny] = dist[x][y] + 1;
						q.offer(new Point(nx,ny));
						visited[nx][ny]=true;
						
						if(ans<dist[nx][ny]) ans = dist[nx][ny];
					}
				}
			}
		}
	}

	
}
