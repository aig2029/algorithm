package algorithm;

import java.util.Arrays;

public class Problem191116_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static int answer;

	public int solution(int n, int[][] edge) {
		answer = 0;
		int[] level = new int[n + 1];
		Arrays.fill(level, n + 1);
		level[1] = 1;

		int max = 0;
		System.out.println(level[1]);
		System.out.println(level[3]);
		int k = 0;
		while (true) {
			boolean allPass = true;
			for (int i = 0; i < edge.length; i++) {

				int a = edge[i][0];
				int b = edge[i][1];
				if (level[a] != n + 1) {
					level[b] = Math.min(level[b], level[a] + 1);
					if (max < level[b])
						max = level[b];
					System.out.println(b + "번의 level " + level[b]);
					continue;
				}
				if (level[b] != n + 1) {
					level[a] = Math.min(level[a], level[b] + 1);
					if (max < level[a])
						max = level[a];
					System.out.println(a + "번의 level " + level[a]);
					continue;
				}
				allPass = false;

			}
			if (allPass)
				break;

		}
		for (int i = 1; i <= n; i++) {
			if (level[i] == max)
				answer++;
		}

		return answer;
	}

	
}
