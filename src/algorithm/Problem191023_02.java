package algorithm;

import java.util.Stack;

public class Problem191023_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String arrangement) {

		int answer = 0;

		Stack<Integer> ironBar = new Stack<>();
		// ironBar.push(1);
		// System.out.println(ironBar.pop());

		char[] chr = arrangement.toCharArray();

		for (int i = 0; i < chr.length; i++) {
			if (i != chr.length - 1 && chr[i] == '(' && chr[i + 1] != ')') {
				ironBar.push(1);
			} else if (chr[i] == ')' && chr[i - 1] == '(') {
				answer += ironBar.size();
			} else if (chr[i] == ')' && chr[i - 1] != '(') {
				answer += ironBar.pop();
			}

			System.out.print(chr[i]);
		}

		return answer;
	}
	
	// replace를 활용해 더 깔끔하게 만든 코드
//	public int solution(String arrangement) {
//
//		int answer = 0;
//		arrangement = arrangement.replace("()", "0");
//		Stack<Integer> ironBar = new Stack<>();
//		// ironBar.push(1);
//		// System.out.println(ironBar.pop());
//
//		char[] chr = arrangement.toCharArray();
//
//		for (int i = 0; i < chr.length; i++) {
//			if (chr[i] == '(') {
//				ironBar.push(1);
//			} else if (chr[i] == '0') {
//				answer += ironBar.size();
//			} else if (chr[i] == ')') {
//				answer += ironBar.pop();
//			}
//
//			System.out.print(chr[i]);
//		}
//
//		return answer;
//	}
	
	
	
}
