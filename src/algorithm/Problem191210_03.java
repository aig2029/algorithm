package algorithm;

public class Problem191210_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		int min = Integer.MAX_VALUE;

		int sumOfSecondPart = 0;
		for (int a : A) {
			sumOfSecondPart += a;
		}
		int sumOfFirstPart = 0;
		for (int i = 0; i < A.length - 1; i++) {
			sumOfFirstPart += A[i];
			sumOfSecondPart -= A[i];
			// System.out.println(sumOfFirstPart+" "+sumOfSecondPart);
			min = Math.min(Math.abs(sumOfFirstPart - sumOfSecondPart), min);
			// System.out.println(min);
		}
		return min;
	}

	
}
