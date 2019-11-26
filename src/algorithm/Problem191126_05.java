package algorithm;

import java.util.ArrayList;

public class Problem191126_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[][] solution(int n, int[][] build_frame) {
		int[][] answer;

		int[][] pillar = new int[n + 1][n + 1]; // 기둥
		int[][] beam = new int[n + 1][n + 1]; // 보

		for (int i = 0; i < build_frame.length; i++) { // 총 길이 k
			int x = build_frame[i][0];
			int y = build_frame[i][1];
			int structure = build_frame[i][2]; // 기둥/보 (0/1)
			int instOrDel = build_frame[i][3]; // 삭제/설치 (0/1)

			//기둥은 바닥 위에 있거나 보의 한쪽 끝 부분 위에 있거나, 또는 다른 기둥 위에 있어야 합니다.
			//보는 한쪽 끝 부분이 기둥 위에 있거나, 또는 양쪽 끝 부분이 다른 보와 동시에 연결되어 있어야 합니다.

			if (instOrDel == 1) {
				System.out.println("설치시작^^");
				if (structure == 0) {
					if (y == 0 || beam[x][y] == 1) {
						pillar[x][y]++;
					} else if ((x - 1 >= 0 && y - 1 >= 0) && (beam[x - 1][y] == 1 || pillar[x][y - 1] >= 1)) {
						pillar[x][y]++;
					}
				}
				if (structure == 1) {
					if ((y - 1) >= 0 && (pillar[x][y - 1] == 1 || pillar[x + 1][y - 1] == 1)) {
						beam[x][y]++;
					} else if ((x - 1 >= 0) && (beam[x - 1][y] == 1 && beam[x + 1][y] == 1)) {
						beam[x][y]++;
					}

				}
			}
			if (instOrDel == 0) {
				System.out.println("삭제시작^^");

				if (structure == 0) { // x,y의 기둥을 삭제할것임 2아 존나게 어렵다진짜 ㅋ
					boolean canDelete = true;

					if ((y + 1) <= n && pillar[x][y + 1] == 1) { // x,y기둥 위에 기둥이 하나 있다면..
						if ((x - 1 >= 0 && y + 1 <= n) && beam[x - 1][y + 1] == 1 || beam[x][y + 1] == 1) { // x,y가 없어져서 x,y+1기둥이 살아남을수 잇는 조건..

						} else
							canDelete = false;
					}
					if ((x - 1 >= 0 && y + 1 <= n) && beam[x - 1][y + 1] == 1) { // 왼쪽에서 x,y기둥 위로 향하는 보가 있을 때,
						if ((x - 1 >= 0) && pillar[x - 1][y] == 1
								|| (((x - 2) >= 0 && (y + 1) <= n) && beam[x - 2][y + 1] == 1 && beam[x][y + 1] == 1)) { // 왼쪽의 보가 조건을 만족할 경우.

						} else
							canDelete = false;

					}
					if (y + 1 <= n && beam[x][y + 1] == 1) { // x,y기둥 위에 오른쪽으로 향하는 보가 있을 때.
						if ((x + 1 <= n && pillar[x + 1][y] == 1)
								|| ((x - 1 >= 0 && y + 1 <= n) && beam[x - 1][y + 1] == 1 && beam[x + 1][y + 1] == 1)) { // 오른쪽의 보가 조건을 만족할 때 , x+2 indexOutofRange..

						} else
							canDelete = false;
					}

					if (canDelete)
						pillar[x][y] = 0;

				}
				if (structure == 1) {
					boolean canDelete = true;

					if (pillar[x][y] == 1) {
						if ((y - 1 >= 0 && pillar[x][y - 1] == 1) || ((x - 1) >= 0 && beam[x - 1][y] == 1)) {

						} else
							canDelete = false;
					}
					if (x + 1 <= n && pillar[x + 1][y] == 1) {
						if ((x + 1) <= n && (y - 1 >= 0 && pillar[x + 1][y - 1] == 1) || beam[x + 1][y] == 1) {

						} else
							canDelete = false;
					}

					if ((x - 1 >= 0 && beam[x - 1][y] == 1)) { // 왼쪽에 보 있는경우..
						if (pillar[x - 1][y - 1] == 1 || pillar[x][y - 1] == 1) {

						} else
							canDelete = false;
					}

					if ((x + 1 <= n && beam[x + 1][y] == 1)) { // 오른쪽에 보 있는경우..
						if (y - 1 >= 0 && pillar[x + 1][y - 1] == 1 || (x + 2 <= n && pillar[x + 2][y - 1] == 1)) {

						} else
							canDelete = false;
					}
					if (canDelete)
						beam[x][y] = 0;

				}

			}
			System.out.print(build_frame[i][0] + " ");
			System.out.print(build_frame[i][1] + " ");
			System.out.print(build_frame[i][2] + " ");
			System.out.print(build_frame[i][3] + " ");
			System.out.println();
		}

		for (int j = n; j >= 0; j--) {
			for (int i = 0; i < n + 1; i++) {
				System.out.print(pillar[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int j = n; j >= 0; j--) {
			for (int i = 0; i <= n; i++) {
				System.out.print(beam[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		ArrayList<Structure> arr = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (pillar[i][j] >= 1) {
					arr.add(new Structure(i, j, 0));
					pillar[i][j]--;
				}
				if (beam[i][j] >= 1) {
					arr.add(new Structure(i, j, 1));
					beam[i][j]--;
				}
			}
		}

		answer = new int[arr.size()][3];

		for (int i = 0; i < arr.size(); i++) {
			answer[i][0] = arr.get(i).x;
			answer[i][1] = arr.get(i).y;
			answer[i][2] = arr.get(i).kind;
			System.out.println(arr.get(i));
		}

		return answer;
	}

	class Structure {
		int x;
		int y;
		int kind;

		Structure(int x, int y, int kind) {
			this.x = x;
			this.y = y;
			this.kind = kind;
		}

		public String toString() {
			return x + " " + y + " " + kind;
		}

	}

	
}
