package algorithm;

public class Problem191129_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				answer += i;
		}

		return answer;
	}

	
}
