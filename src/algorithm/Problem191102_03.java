package algorithm;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem191102_03 {
					// 상 하 좌 우	
	static int[] dx = {-1,1,0,0 };
	static int[] dy = {0,0,-1,1 };
	
	final static int MAX_SIZE = 25;
	static int[][] map = new int[MAX_SIZE][MAX_SIZE];
	static boolean[][] visited = new boolean[MAX_SIZE][MAX_SIZE];
	static ArrayList<Integer> arr = new ArrayList<>();
	static int houseNum;
	static int N;
	static Queue<Point> q = new LinkedList<>();
	
	// 단지번호붙이기 복습
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<N; i++) {
			String str = sc.nextLine();
			for(int j=0; j<N; j++) {
				map[i][j] = str.charAt(j)-'0';
//				System.out.print(map[i][j]); 
			}
//			System.out.println();
		}
		
		houseNum=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				
				if(map[i][j]==1 && !visited[i][j]) {
					houseNum=0;
					BFS(i,j);
				}
			}
		}
		
		Collections.sort(arr);
		System.out.println(arr.size());
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}
	
	// i, j는 좌표
	static void BFS(int x, int y) {
		
		visited[x][y]=true;
		q.offer(new Point(x, y));
		
		while(!q.isEmpty()) {
			Point now = q.poll();
//			System.out.println("("+now.x+","+now.y+")");
			houseNum++;
			
			for(int i=0; i<4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx>=0 && nx<N && ny>=0 && ny<N) {
					if(map[nx][ny]==1 && !visited[nx][ny]) {
						q.offer(new Point(nx,ny));
						visited[nx][ny]=true;
					}
				}
			}
		}
		arr.add(houseNum);
		
	}

	
}
