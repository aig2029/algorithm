package algorithm;

import java.util.Stack;

public class Problem191129_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "3+[(5+1)-1]";
		String str2= "3+([5+1])";
		String str3= "3+{(5+1}";
		String str4= "3+[{(5+1)-1}+3]";
		
		System.out.println(solution(str1.toCharArray()));
		System.out.println(solution(str2.toCharArray()));
		System.out.println(solution(str3.toCharArray()));
		System.out.println(solution(str4.toCharArray()));
	}
	
	static boolean solution(char[] input) {
		Stack<Character> st = new Stack<>();
		for(Character c : input) {
			if(c=='[') {
				if(!st.isEmpty()) {
					return false;
				}
				else st.push(c);
			}
			else if(c=='{'){
				if(!st.isEmpty()) {
					if(st.peek()=='(') return false;
					else st.push(c);
				}
				else st.push(c);
			}
			else if(c=='('){
				st.push(c);
			}			
			else if(c==']'){
				if(st.isEmpty()) {
					return false;
				}
				else {
					if(st.peek()!='[') return false;
					else st.pop();
				}
			}
			else if(c=='}'){
				if(st.isEmpty()) {
					return false;
				}
				else {
					if(st.peek()!='{') return false;
					else st.pop();
				}
				
			}
			else if(c==')'){
				if(st.isEmpty()) {
					return false;
				}
				else {
					if(st.peek()!='(') return false;
					else st.pop();
				}
			}
			
		}
		//
		if(st.isEmpty()) return true;
		else return false;
	}

	
}
