package algorithm;

public class Problem191019_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n) {
		int answer = n;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				answer += i;
		}
		return answer;
	}
	
}
