package algorithm;

public class Problem191019_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int n, int m) {

		int a = (n > m) ? m : n;
		int b = (n > m) ? n : m;

		while (a != 0) {
			int temp = a;
			a = b % a;
			b = temp;
		}

		System.out.println(b);

		return new int[] { b, (n * m / b) };
	}
	
}
