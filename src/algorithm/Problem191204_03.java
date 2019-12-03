package algorithm;

import java.util.Stack;

public class Problem191204_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String arrangement) {
		int answer = 0;

		Stack<Character> st = new Stack<>();
		arrangement = arrangement.replace("()", "0");

		System.out.println(arrangement);

		for (int i = 0; i < arrangement.length(); i++) {
			if (arrangement.charAt(i) == '0')
				answer += st.size();
			else if (arrangement.charAt(i) == '(')
				st.push('(');
			else {
				st.pop();
				answer++;
			}
		}

		return answer;
	}

	
}
