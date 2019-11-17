package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem191116_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n, int[][] edge) {
		int answer = 0;
		boolean[] visited = new boolean[n + 1];
		boolean[][] connected = new boolean[n + 1][n + 1];

		for (int i = 0; i < edge.length; i++) {
			int a = edge[i][0];
			int b = edge[i][1];
			connected[a][b] = connected[b][a] = true;
		}

		Queue<Integer> q = new LinkedList<>();
		List<Integer> nextNodes = new ArrayList<>();
		q.add(1);
		visited[1] = true;

		while (true) {
			answer = q.size();
			while (!q.isEmpty()) {
				int now = q.poll();

				for (int i = 1; i <= n; i++) {
					if (!visited[i] && connected[now][i]) {
						nextNodes.add(i);
						visited[i] = true;
					}
				}
			}
			q.addAll(nextNodes);
			if (nextNodes.size() == 0)
				break;

			nextNodes.clear();
		}

		return answer;
	}

	
}
