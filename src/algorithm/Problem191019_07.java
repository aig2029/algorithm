package algorithm;

public class Problem191019_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(long n) {
		int[] answer;

		System.out.println((int) (Math.log10(n) + 1));
		long size = (long) (Math.log10(n) + 1);
		answer = new int[(int) size];

		int idx = 0;
		while (n != 0) {
			int res = (int) (n % 10);
			answer[idx++] = res;
			n /= 10;
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		return answer;
	}
	
}
