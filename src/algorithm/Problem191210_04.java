package algorithm;

import java.util.Arrays;

public class Problem191210_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int solution(int[] A) {

		Arrays.sort(A);
		int comparativeValue = 1;
		for (int i = 0; i < A.length; i++) {
			if (comparativeValue++ != A[i])
				return 0;

		}//

		return 1;
	}
}
