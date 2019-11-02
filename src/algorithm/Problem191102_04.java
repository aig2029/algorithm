package algorithm;

import java.util.Scanner;

public class Problem191102_04 {
	
	final static int MAX_SIZE = 101;
	static int[][] computer = new int[MAX_SIZE][MAX_SIZE];
	static boolean[] visited = new boolean[MAX_SIZE];
	static int infectedComNum = 0;
	static int comNum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		comNum = sc.nextInt();
		int comSet = sc.nextInt();
		
		for(int i=0; i<comSet; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
//			System.out.println(A+" "+B);
			
			computer[A][B]=1;
			computer[B][A]=1;
		}

		
		
		System.out.println(DFS(1));
	}
	
	static int DFS(int j) {
		visited[j]=true;
//		System.out.println(j);
		
		for(int k=1; k<=comNum; k++) {
			if(computer[j][k]==1 && !visited[k]) {
				DFS(k);
				infectedComNum++;
			}
		}
		return infectedComNum;
		
	}

	
}
