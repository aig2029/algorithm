package algorithm;

public class Problem191126_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String s) {
		int answer = 1;

		int leng = s.length();

		for (int i = 0; i < leng; i++) {
			int start = i;
			int end = i + 1;

			while (start >= 0 && end < leng && s.charAt(start) == s.charAt(end)) {
				// System.out.println(s.substring(start,end+1));
				// System.out.println(start+" "+end);
				if (end - start + 1 > answer)
					answer = end - start + 1;
				start--;
				end++;
			}

			start = i;
			end = i + 2;

			while (start >= 0 && end < leng && s.charAt(start) == s.charAt(end)) {
				// System.out.println(start+" "+end);
				// System.out.println(s.substring(start,end+1));      
				if (end - start + 1 > answer)
					answer = end - start + 1;
				start--;
				end++;
			}

			start = i;
			end = i + 2;
		}

		return answer;
	}

	
}
