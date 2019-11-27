package algorithm;

public class Problem191128_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int n, int s) {
		int[] answer = new int[n];

		int min = s / n;
		if (min < 1)
			return new int[] { -1 };

		int rest = s % n; // min+1개수
		int input = 0;

		for (int i = n - 1; i >= 0; i--) {
			input = min;
			if (rest-- > 0)
				input++;

			answer[i] = input;
		}

		return answer;
	}

	
}
