package algorithm;

public class Problem191210_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(String S, int[] P, int[] Q) {
		// write your code in Java SE 8

		System.out.println(S);

		int[] answer = new int[P.length];

		int[] A = new int[S.length() + 1];
		int[] C = new int[S.length() + 1];
		int[] G = new int[S.length() + 1];

		for (int i = 0; i < S.length(); i++) {
			// System.out.println(S.charAt(i));
			if (S.charAt(i) == 'A') {
				A[i + 1] = A[i] + 1;
				C[i + 1] = C[i];
				G[i + 1] = G[i];
			} else if (S.charAt(i) == 'C') {
				C[i + 1] = C[i] + 1;
				A[i + 1] = A[i];
				G[i + 1] = G[i];
			} else if (S.charAt(i) == 'G') {
				G[i + 1] = G[i] + 1;
				A[i + 1] = A[i];
				C[i + 1] = C[i];
			} else {
				A[i + 1] = A[i];
				C[i + 1] = C[i];
				G[i + 1] = G[i];
			}

		}

		for (int i = 0; i < P.length; i++) {
			int start = P[i];
			int end = Q[i] + 1;
			if (A[end] - A[start] > 0)
				answer[i] = 1;
			else if (C[end] - C[start] > 0)
				answer[i] = 2;
			else if (G[end] - G[start] > 0)
				answer[i] = 3;
			else
				answer[i] = 4;
		}

		return answer;
	}

	
}
