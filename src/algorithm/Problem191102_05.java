package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem191102_05 {

	static int MAX_SIZE = 101;
	static int[][] computer = new int[MAX_SIZE][MAX_SIZE];
	static boolean[] visited = new boolean[MAX_SIZE];
	static int infectedComNum = 0;
	static int comNum;
	
	static Queue<Integer> q = new LinkedList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		comNum = sc.nextInt();
		int comSet = sc.nextInt();
		
		for(int i=0; i<comSet; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			computer[A][B]=computer[B][A]=1;
//			System.out.println(A+ " " + B);
		}
		
		System.out.println(BFS(1));
	}
	
	static int BFS(int j) {
		
		q.offer(j);
		visited[j]=true;
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			for(int k=1; k<=comNum; k++) {
				if(computer[now][k]==1 && !visited[k]){
					q.offer(k);
					infectedComNum++;
					visited[k]=true;
				}
			}
		}
		
		return infectedComNum;
	}

	
}
