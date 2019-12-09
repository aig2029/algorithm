package algorithm;

public class Problem191207_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int[] A, int K) {
		// write your code in Java SE 8

		if (A.length == 0)
			return new int[] {};

		int[] ans = new int[A.length];

		K = K % A.length;
		for (int i = 0; i < A.length; i++) {
			// System.out.println(i);
			ans[(i + K) % A.length] = A[i];
		}

		return ans;
	}

	
}
