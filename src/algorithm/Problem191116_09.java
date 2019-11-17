package algorithm;

public class Problem191116_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static int answer = 0;
	static boolean[] visited;
	static int n;
	static int[][] computers;

	public int solution(int inputN, int[][] inputComputers) {
		answer = 0;
		n = inputN;
		visited = new boolean[n];
		computers = inputComputers;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[j] && !visited[i] && computers[i][j] == 1) {
					visited[i] = true;
					DFS(i, j);
					answer++;
				}
			}
		}

		return answer;
	}

	static void DFS(int i, int j) {
		visited[j] = true;

		for (int k = 0; k < n; k++) {
			if (!visited[k] && computers[j][k] == 1) {
				DFS(j, k);
			}
		}

	}

	
}
