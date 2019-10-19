package algorithm;

public class Problem191020_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = x * (i + 1);
		}
		return answer;
	}
	
}
