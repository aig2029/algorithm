package algorithm;

import java.util.PriorityQueue;

public class Problem191121_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
	}
	
	static int answer;
	static int[] row;
	static int n;

	public int solution(int inputN) {
		answer = 0;
		n = inputN;

		for (int i = 0; i < n; i++) {
			row = new int[n];
			row[0] = i;
			nqueen(1);
		}

		return answer;
	}

	void nqueen(int col) {

		// column이 n이랑 같을 경우 ( 체스판 초과할 경우 처리 )
		if (col == n) {
			answer++;
			return;
		}

		Loop1: for (int i = 0; i < n; i++) {
			row[col] = i;
			for (int j = 0; j < col; j++) {
				if (row[j] == row[col] || Math.abs(row[j] - row[col]) == col - j) {
					continue Loop1;
				}
			}
			nqueen(col + 1);
		}

	}

	
}
