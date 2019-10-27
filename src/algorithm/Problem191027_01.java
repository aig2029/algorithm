package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem191027_01 {
	
	static final int MAX_SIZE = 25;
	// 위, 오른, 아래, 왼
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	
	static int N; // 행과 열의 수
	static int group_id=0;
	static int[] groups = new int[MAX_SIZE*MAX_SIZE];
	
	static int[][] map = new int[MAX_SIZE][MAX_SIZE];
	static boolean[][] visited = new boolean[MAX_SIZE][MAX_SIZE];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<N; i++) {
			String st = sc.nextLine();
			for(int j=0; j<N; j++) {
				map[i][j]=(int)st.charAt(j)-48;
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]==1 && visited[i][j]==false) {
					group_id++;
					dfs_recursion(i, j);
				}
				
			}
		}
		
		System.out.println(group_id);
		int k=0;

		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=1; i<=group_id; i++) {
//			System.out.println(groups[i]);
			arr.add(groups[i]);
		}
		
		Collections.sort(arr);
		
		for(Integer integer : arr) {
			System.out.println(integer);
		}

		
		

//		for(int i=0; i<N; i++) {
//			for(int j=0; j<N; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
	}
	
	public static void dfs_stack(int x, int y) {
		
		
	}
	
	public static void dfs_recursion(int x, int y) {
		
		// 함수에 들어왓으면 -> 방문으로 표시
		visited[x][y] = true;
		
		// 해당 단지의 집의 수를 증가시킴
		groups[group_id]++;
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			// 지도를 벗어나지 않고
			if(0<= nx && nx <N && 0<=ny && ny<N){
				if(map[nx][ny]==1 && visited[nx][ny]==false) {
					dfs_recursion(nx,ny);
				}
			}
		}
	
	}
	
}
