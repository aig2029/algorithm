package algorithm;

public class Problem191019_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(long num) {
		int answer = 0;

		if (num == 1)
			return 0;

		while (true) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = (num * 3) + 1;
			}

			answer++;

			if (answer >= 500)
				return -1;
			else if (num == 1)
				return answer;
		}

	}
	
}
