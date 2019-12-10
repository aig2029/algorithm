package algorithm;

public class Problem191210_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int solution(int[] A) {
		// write your code in Java SE 8

		int accum = 0;
		int sum = 0;

		for (int i = A.length - 1; i >= 0; i--) {
			if (A[i] == 1)
				accum++;
			else
				sum += accum;
				
			if(sum>1000000000) return -1;	
		}

		return sum;

	}
}
