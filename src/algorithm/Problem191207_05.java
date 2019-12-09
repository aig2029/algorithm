package algorithm;

public class Problem191207_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	

	
	public int solution(int N) {
		// write your code in Java SE 8
		int answer = 0;

		System.out.println(N);

		String binary = decToBinary(N);

		System.out.println(binary);

		int count = 0;
		boolean isCountable = false;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				isCountable = true;
				if (count > answer)
					answer = count;
				count = 0;
			}
			if (binary.charAt(i) == '0' && isCountable) {
				count++;
			}
		}

		return answer;
	}

	public String decToBinary(int N) {
		String str = "";

		int mod;
		while (N > 0) {
			mod = N % 2;
			N /= 2;

			str = Integer.toString(mod) + str;
		}

		return str;
	}
	

	
}
