package algorithm;

public class Problem191116_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String dartResult) {
		int answer = 0;

		dartResult = dartResult.replace("10", "t");
		int num = 0;
		int prevNum = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			char now = dartResult.charAt(i);
			if (now >= '0' && now <= '9') {
				prevNum = num;
				num = now - '0';
			} else if (now == 't') {
				prevNum = num;
				num = 10;
			} else if (now == 'D')
				num = num * num;
			else if (now == 'T')
				num = num * num * num;
			else if (now == '#') {
				num = -num;
				answer += num;
				continue;
			} else if (now == '*') {
				num = num * 2;
				answer = answer + (prevNum + num);
				continue;
			}

			if (i == dartResult.length() - 1 || dartResult.charAt(i + 1) == 't'
					|| (dartResult.charAt(i + 1) >= '0' && dartResult.charAt(i + 1) <= '9')) {
				answer += num;
			}

			System.out.println(now);
			System.out.println("preveNum " + prevNum);
			System.out.println("num " + num);
			System.out.println("answer " + answer);

		}

		return answer;
	}

	
}
