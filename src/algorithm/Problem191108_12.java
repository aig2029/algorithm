package algorithm;

import java.awt.Point;
import java.util.Stack;

public class Problem191108_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	static String[] sBoard;
	static int[] dx = { 0, 1, 0, 1 };
	static int[] dy = { 0, 0, 1, 1 };
	static Stack<Point> st;

	public int solution(int m, int n, String[] board) {
		int answer = 0;

		st = new Stack<>();
		sBoard = board;

		viewBlock();

		for (int i = 0; i < sBoard.length; i++) {
			for (int j = 0; j < sBoard[i].length(); j++) {
				findBlock(i, j);
			}
		}
		deleteBlock();
		viewBlock();

		return answer;
	}

	static void shiftBlock() {
		for (int i = sBoard.length; i > 0; i--) {
			if (sBoard[i].charAt(0) == '0') {
				for (int j = i - 1; j >= 0; j--) {
//					sBoard[j].charAt(0) = sBoard[j - 1].charAt(0);
				}
			}
		}
	}

	static void viewBlock() {
		for (int i = 0; i < sBoard.length; i++) {
			System.out.println(sBoard[i]);
		}
	}

	static void findBlock(int x, int y) {
		int blockCount = 0;
		for (int k = 0; k < 4; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];

			if (nx >= 0 && ny >= 0 && nx < sBoard.length && ny < sBoard[0].length()) {
				if (sBoard[x].charAt(y) == sBoard[nx].charAt(ny)) {
					blockCount++;
					continue;
				} else
					return;
			}
		}
		if (blockCount == 4) {
			st.push(new Point(x, y));
			System.out.println(x + " " + y);
		}
	}

	static void deleteBlock() {
		while (!st.isEmpty()) {
			Point now = st.pop();
			int x = now.x;
			int y = now.y;

			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];

				sBoard[nx] = sBoard[nx].substring(0, ny) + "0" + sBoard[nx].substring(ny + 1);
			}
		}
	}

	
}
