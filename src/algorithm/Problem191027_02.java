package algorithm;

import java.awt.Point;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Problem191027_02 {
	final static int MAX_SIZE = 25;
	static Queue<Point> q = new LinkedList<>();
	static int[][] map = new int[MAX_SIZE][MAX_SIZE];
	static int[][] visited = new int[MAX_SIZE][MAX_SIZE];
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	static int N;
	
	static PriorityQueue<Integer> pq = new PriorityQueue<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		String temp;
		
		for(int i=0; i<N; i++) {
			temp = sc.nextLine();
			for(int j=0; j<N; j++) {
				map[i][j]=temp.charAt(j)-'0';
			}
		}
		
		
		for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) { 
                if(map[i][j] == 1 && visited[i][j] == 0) {
                    BFS(i,j);
                }
            }
		}
		
//		 for(int i=0;i<N;i++) {
//	            for(int j=0;j<N;j++) {
//	            	System.out.print(map[i][j]);
//	        }
//	        System.out.println();
//		 }
		 
                
		System.out.println(pq.size());
		Iterator<Integer> iter = pq.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	static void BFS(int i, int j) 
    {
        int nx,ny;
        int local_cnt = 1;
        q.offer(new Point(i,j));
        visited[i][j] = 1;
        
        while(q.isEmpty()==false) 
        {
            Point now;
            now = q.poll();
            
            for(int h=0;h<4;h++) {
            nx = now.x+dx[h];
            ny = now.y+dy[h];
            
            if(nx>=0&&ny>=0&&nx<N&&ny<N) {
            if(map[nx][ny] == 1 && visited[nx][ny]==0) {
                q.offer(new Point(nx,ny));
                visited[nx][ny] = 1;
                local_cnt++;
                    }
                }
            }
        }
        pq.add(local_cnt);
    }

	
}
