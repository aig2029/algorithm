package algorithm;

public class Problem191108_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n, int a, int b) {
		int answer = 1;

		System.out.println(n + " " + a + " " + b);
		while (true) {
			if ((a + b + 1) % 4 == 0 && Math.abs(a - b) == 1)
				break;
			// System.out.println(answer);
			a = (a % 2 == 0) ? a / 2 : (a + 1) / 2;
			b = (b % 2 == 0) ? b / 2 : (b + 1) / 2;
			n /= 2;
			System.out.println(n + " " + a + " " + b);
			answer++;
		}

		return answer;
	}

	
}
