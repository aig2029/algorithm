package algorithm;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem191102_06 {

	final static int MAX_SIZE = 51;
	static String[][] map = new String[MAX_SIZE][MAX_SIZE];
	static int ans = 0;
	static Queue<Point> q = new LinkedList<>();
	static boolean[][] visited ;
	
	static int garo;
	static int sero;
	
	static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		garo = sc.nextInt();
		sero = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=garo; i++) {
			String str = sc.nextLine();
//			System.out.println(str);
			for(int j=1; j<=sero; j++) {
				map[i][j] = str.substring(j-1, j);
				System.out.print(map[i][j]);
			}
//			System.out.println();
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
		q.offer(new Point(i,j));
		visited[i][j] = true;
		int[][] dist = new int[garo+1][sero+1];
		int temp=0;
		
		while(!q.isEmpty()) {
//			System.out.println("BFS들어갓음..");
			Point now = q.poll();
			int x = now.x;
			int y = now.y;
			
			for(int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				
				if (1 <= nx && nx <= garo  && 1 <= ny && ny <= sero) {
                    if (!visited[nx][ny] && map[nx][ny].equals("L")) {
                        q.offer(new Point(nx, ny));
                        dist[nx][ny] = dist[x][y] + 1;
                        visited[nx][ny] = true;
                        
//                        System.out.println(nx+","+ny);
//                        System.out.println(dist[nx][ny]);
                        
                        if (temp < dist[nx][ny]) {
                            temp = dist[nx][ny];
                        }
                    }
                }

			}
		}
		
		if(temp>ans) ans = temp;
		
	}

	
}
