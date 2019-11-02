package algorithm;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem191102_07 {

	final static int MAX_SIZE = 51;
	static int garo;
	static int sero;
	static String[][] map = new String[MAX_SIZE][MAX_SIZE];
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0};
	static int[] dy = { 0, 0, -1, 1};
			
	
	
	static int ans=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		garo = sc.nextInt();
		sero = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=garo; i++) {
			String str = sc.nextLine();
			for(int j=1; j<=sero; j++) {
				map[i][j] = str.substring(j-1,j);
//				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		for(int i=1; i<=garo; i++) {
			for(int j=1; j<=sero; j++) {
				if(map[i][j].equals("L")) {
					visited = new boolean[MAX_SIZE][MAX_SIZE];
					BFS(i,j);
				}
				
			}
		}
		System.out.println(ans);
		
	
	}
	
	static void BFS(int i, int j) {
		int temp=0;
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(i,j));
		visited[i][j]=true;
		int[][] dist = new int[MAX_SIZE][MAX_SIZE];
		
		while(!q.isEmpty()) {
			Point now = q.poll();
			int x = now.x;
			int y = now.y;
			
			for(int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
//				System.out.println(nx+ " " + ny);
				
				
				if( nx>=1 && nx<= garo && ny>=1 && ny<= sero) {
					if( !visited[nx][ny] && map[nx][ny].equals("L")) {
						q.offer(new Point(nx,ny));
						visited[nx][ny] = true;
						dist[nx][ny] = dist[x][y]+1;
						if(temp<dist[nx][ny]) temp = dist[nx][ny];
					}
				}
				System.out.println(temp);
			}
		}
		if(ans<temp) ans = temp;
	}
}
