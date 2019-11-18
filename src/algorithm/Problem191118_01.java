package algorithm;

import java.util.LinkedList;
import java.util.List;

public class Problem191118_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n, int[][] costs) {
		int answer = 0;

		int[][] charge = new int[n][n];
		boolean[] visited = new boolean[n];

		for (int i = 0; i < costs.length; i++) {
			int a = costs[i][0];
			int b = costs[i][1];
			charge[a][b] = charge[b][a] = costs[i][2];
		}

		List<Integer> islandList = new LinkedList<>();
		islandList.add(0);
		visited[0] = true;

		while (islandList.size() < n) {
			int min = Integer.MAX_VALUE;
			int minIdx = -1;

			for (int i = 0; i < islandList.size(); i++) {
				int now = islandList.get(i);
				System.out.println(now);
				for (int j = 0; j < n; j++) {
					if (!visited[j] && now != j && charge[now][j] > 0 && min > charge[now][j]) {

						min = charge[now][j];
						minIdx = j;

					}
				}
			}

			visited[minIdx] = true;
			islandList.add(minIdx);
			answer += min;
		}

		return answer;
	}

	
}
