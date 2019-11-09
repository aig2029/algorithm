package algorithm;

import java.awt.Point;
import java.util.Stack;

public class Problem191110_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static char[][] sBoard;
    static int[] dx = { 0, 1, 0, 1 };
	static int[] dy = { 0, 0, 1, 1 };
    static Stack<Point> st;
    
    
	public int solution1(int m, int n, String[] board) {
		int answer = 0;

		st = new Stack<>();
		sBoard = new char[board.length][board[0].length()];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length(); j++) {
				sBoard[i][j] = board[i].charAt(j);
				// System.out.print(sBoard[i][j]);
			}
			// System.out.println();
		}

		int asd = 0;
		while (true) {
			// viewBoard();
			for (int i = 0; i < sBoard.length; i++) {
				for (int j = 0; j < sBoard[0].length; j++) {
					findBoard(i, j);
				}
			}
			if (st.isEmpty())
				break;

			deleteBoard();
			// viewBoard();
			shiftBoard();
			// viewBoard();
			// System.out.println("------");
		}

		for (int i = 0; i < sBoard.length; i++) {
			for (int j = 0; j < sBoard[0].length; j++) {
				if (sBoard[i][j] == ' ')
					answer++;
			}
		}

		return answer;
	}

	static void shiftBoard() {
		for (int i = sBoard.length - 2; i >= 0; i--) {
			for (int j = 0; j < sBoard[0].length; j++) {
				if (sBoard[i][j] != ' ' && sBoard[i + 1][j] == ' ') {
					int k = 1;
					while (true) {
						if (i + k + 1 < sBoard.length) {
							if (sBoard[i + k + 1][j] == ' ')
								k++;
							else
								break;
						} else
							break;
					}
					sBoard[i + k][j] = sBoard[i][j];
					sBoard[i][j] = ' ';

				}
			}
		}

	}

	static void deleteBoard() {
		while (!st.isEmpty()) {
			Point now = st.pop();
			int x = now.x;
			int y = now.y;

			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];

				sBoard[nx][ny] = ' ';
			}
		}
	}

	static void viewBoard() {
		for (int i = 0; i < sBoard.length; i++) {
			for (int j = 0; j < sBoard[0].length; j++) {
				System.out.print(sBoard[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	static void findBoard(int x, int y) {
		int blockCount = 0;
		for (int k = 0; k < 4; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];

			if (nx >= 0 && ny >= 0 && nx < sBoard.length && ny < sBoard[0].length) {
				if (sBoard[x][y] != ' ' && sBoard[x][y] == sBoard[nx][ny]) {
					blockCount++;
					continue;
				} else
					return;
			}
		}
		if (blockCount == 4) {
			st.push(new Point(x, y));
			// System.out.println(x + " " + y);
		}
	}

	
}
