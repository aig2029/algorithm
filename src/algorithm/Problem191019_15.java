package algorithm;

public class Problem191019_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean solution(int x) {

		int n = x;
		int digit = 0;
		while (n > 0) {
			digit += n % 10;
			n /= 10;
		}
		if (x % digit == 0)
			return true;
		else
			return false;

	}
	
}
