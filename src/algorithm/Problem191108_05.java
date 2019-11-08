package algorithm;

import java.util.Stack;

public class Problem191108_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String s) {

		Stack<String> st = new Stack<>();
		st.push(s.substring(0, 1));

		for (int i = 1; i < s.length(); i++) {
			String temp = s.substring(i, i + 1);
			// System.out.println(s.substring(i,i+1));
			if (st.isEmpty()) {
				st.push(temp);
			} else {
				if (st.peek().equals(temp)) {
					st.pop();
				} else
					st.push(temp);
			}

		}

		if (st.size() == 0)
			return 1;
		else
			return 0;

	}

	
}
