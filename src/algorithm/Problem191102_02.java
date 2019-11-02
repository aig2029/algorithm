package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem191102_02 {
					// 상 하 좌 우	
	static int[] dx = {-1,1,0,0 };
	static int[] dy = {0,0,-1,1 };
	
	final static int MAX_SIZE = 25;
	static int[][] map = new int[MAX_SIZE][MAX_SIZE];
	static boolean[][] visited = new boolean[MAX_SIZE][MAX_SIZE];
	static ArrayList<Integer> arr = new ArrayList<>();
	static int houseNum;
	static int N;
	
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
					DFS(i,j);
					arr.add(houseNum);
					houseNum=0;
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
	static void DFS(int x, int y) {
		houseNum++;
		visited[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && nx<N && ny>=0 && ny<N) {
				if(map[nx][ny]==1 && !visited[nx][ny]) {
					DFS(nx,ny);
				}
			}
		}
		
	}

	
}
