package algorithm;

public class Problem191213_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] A) {
		// write your code in Java SE 8

		double minValue = (double) Integer.MAX_VALUE;
		int min = 0;

		for (int i = 0; i < A.length - 1; i++) {
			if (i < A.length - 2) {
				if ((double) (A[i] + A[i + 1] + A[i + 2]) / 3 < minValue) {
					min = i;
					minValue = (double) (A[i] + A[i + 1] + A[i + 2]) / 3;
				}
			}

			if ((double) (A[i] + A[i + 1]) / 2 < minValue) {
				min = i;
				minValue = (double) (A[i] + A[i + 1]) / 2;
			}
		}

		return min;
	}

	
}
