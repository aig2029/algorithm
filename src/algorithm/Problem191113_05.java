package algorithm;

public class Problem191113_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toString(0));
	}
	
	public String solution(int n, int t, int m, int p) {
		String answer = "";
		String[] alp = { "A", "B", "C", "D", "E", "F" };

		String totalConvertedNum = "";
		int i = 0;
		while (true) {
			int now = i;
			String convertedNum = "";
			while (true) {
				int input = now % n;
				if (input >= 10) {
					convertedNum = alp[input % 10] + convertedNum;
				} else
					convertedNum = Integer.toString(input) + convertedNum;

				now /= n;
				if (now == 0)
					break;
			}
			// System.out.println(convertedNum);
			// if(converted)
			totalConvertedNum += convertedNum;
			if (totalConvertedNum.length() >= m * t)
				break;
			i++;
		}
		// System.out.println(totalConvertedNum);

		int j = 0;
		while (t-- > 0) {
			answer += totalConvertedNum.substring(p - 1 + j * m, p + j * m);
			j++;
		}

		return answer;
	}
	
	
	
	// 밑에는 stringbuilder로 한것 string붙이는것보다
	// 훨씬 시간 효율30배는 좋음
	
	
	public String solution1(int n, int t, int m, int p) {
		String answer = "";
		String[] alp = { "A", "B", "C", "D", "E", "F" };

		StringBuilder totalConvertedNum = new StringBuilder();
		int i = 0;
		while (true) {
			int now = i;
			StringBuilder convertedNum = new StringBuilder();
			while (true) {
				int input = now % n;
				if (input >= 10) {
					convertedNum.append(alp[input % 10]);
				} else
					convertedNum.append(Integer.toString(input));

				now /= n;
				if (now == 0)
					break;
			}
			// System.out.println(convertedNum.toString());
			// if(converted)
			totalConvertedNum.append(convertedNum.reverse().toString());
			if (totalConvertedNum.toString().length() >= m * t)
				break;
			i++;
		}
		// System.out.println(totalConvertedNum);

		// int j=0;
		// while(t-->0){
		//     answer+= totalConvertedNum.toString().substring(p-1+j*m, p+j*m);
		//     j++;
		// }

		char[] chs = totalConvertedNum.toString().toCharArray();

		StringBuilder sb = new StringBuilder();
		int j = 0;
		while (t-- > 0) {
			sb.append(chs[p - 1 + j * m]);
			j++;
		}

		return sb.toString();
	}

	
}
