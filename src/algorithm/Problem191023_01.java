package algorithm;

public class Problem191023_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}	
	
	public String solution(int n) {
		String answer = "";
		int rest = 0;

		while (n > 0) {
			rest = n % 3;
			n /= 3;
			if (rest == 0) {
				rest = 4;
				n -= 1;
			}
			answer = rest + answer;
		}

		System.out.println(answer);

		return answer;
	}
}
