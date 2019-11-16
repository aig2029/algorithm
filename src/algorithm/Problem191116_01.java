package algorithm;

public class Problem191116_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String s) {
		int answer = s.length();

		// System.out.println(s);

		String nowUnitStr = "";

		for (int i = 1; i <= s.length() / 2; i++) {
			String finalStr = "";
			int count = 1;
			String savedUnitStr = "";
			for (int j = 1; (j - 1) * i <= s.length(); j++) {
				if (j * i > s.length())
					nowUnitStr = s.substring((j - 1) * i);
				else
					nowUnitStr = s.substring((j - 1) * i, j * i);
				// System.out.println(s.substring((j-1)*i,j*i));

				if (nowUnitStr.equals(savedUnitStr)) {
					count++;
				} else if (count != 1) {
					finalStr = finalStr + Integer.toString(count) + savedUnitStr;
					count = 1;
					savedUnitStr = nowUnitStr;
				} else if (count == 1) {
					finalStr = finalStr + savedUnitStr;
					savedUnitStr = nowUnitStr;
				}

				if (j * i > s.length())
					finalStr += savedUnitStr;
				// System.out.println(j+" "+finalStr);

			}
			// System.out.println(finalStr);
			if (answer > finalStr.length())
				answer = finalStr.length();
		}

		return answer;
	}
	
}
