package algorithm;

import java.util.Stack;

public class Problem191213_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String S) {
        // write your code in Java SE 8
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<S.length(); i++){
            switch(S.charAt(i)){
                case '(' :
                    st.push('(');
                    break;
                case ')' :
                    if(st.isEmpty()) return 0;
                    st.pop();
                    break;
            }
            
        }
        if(st.isEmpty()) return 1;
        else return 0;
    }

	
}
