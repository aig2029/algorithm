package algorithm;

public class Problem191210_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int N, int[] A) {
		// write your code in Java SE 8

		int[] res = new int[N];

		int nowMax = 0;
		int preMax = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > N) {
				preMax = nowMax;
			} else {
				if (res[A[i] - 1] > preMax)
					res[A[i] - 1]++;
				else
					res[A[i] - 1] = preMax + 1;

				if (res[A[i] - 1] > nowMax)
					nowMax = res[A[i] - 1];
			}
		}

		for (int i = 0; i < res.length; i++) {
			if (res[i] < preMax)
				res[i] = preMax;
		}

		return res;

	}

	
}
