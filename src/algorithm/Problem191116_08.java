package algorithm;

public class Problem191116_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}//
	
	public long solution(int N) {
		long answer = 0;

		long[] dpSide = new long[N + 1];
		long[] dpCircum = new long[N + 1];

		dpSide[0] = 0;
		dpSide[1] = 1;

		dpCircum[1] = 4;
		for (int i = 2; i <= N; i++) {
			dpSide[i] = dpSide[i - 1] + dpSide[i - 2];
			dpCircum[i] = dpCircum[i - 1] + 2 * dpSide[i];
		}

		// System.out.println(dpCircum[N]);

		return dpCircum[N];
	}

	
}
