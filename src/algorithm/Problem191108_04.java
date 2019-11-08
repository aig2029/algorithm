package algorithm;

public class Problem191108_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] arr) {
		if (arr.length == 1)
			return arr[0];
		int answer = LCM(arr[0], arr[1]);

		for (int i = 2; i < arr.length; i++) {
			answer = LCM(answer, arr[i]);
		}

		return answer;

	}

	static int LCM(int val1, int val2) {

		int r = 1;
		int LCM;

		int tmp1 = val1, tmp2 = val2;//최소공배수를 구하기 위해 입력받은 값 저장
		if (val1 < val2) {//2번째 입력수가 클 경우 큰수를 val1으로 변경
			val1 = tmp2;
			val2 = tmp1;
		}

		while (r > 0) {//유클리드 호제법을 이용한 GCD(최대공약수)구하기
			r = val1 % val2;
			val1 = val2;
			val2 = r;
		}
		LCM = tmp1 * tmp2 / val1;//LCM(최소공배수)구하기

		// System.out.println("GCD(최대공약수) : "+ val1);
		// System.out.println("LCM(최소공배수) : "+ LCM);
		return LCM;

	}

	
}
