package algorithm;

import java.util.Stack;

public class Problem191213_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String S) {
        // write your code in Java SE 8
        
        System.out.println(S);
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            
            switch (c){
                case '{': case '[': case  '(' :
                    st.push(c);
                    break;
                
                case '}' :
                    if(st.isEmpty()) return 0;
                    if(st.peek()=='{') st.pop();
                    else return 0;
                    break;
                case ']' :
                    if(st.isEmpty()) return 0;
                    if(st.peek()=='[') st.pop();
                    else return 0;
                    break;
                case ')' :
                    if(st.isEmpty()) return 0;
                    if(st.peek()=='(') st.pop();
                    else return 0;
                    break;
                
                
            }
        }
        if(st.isEmpty()) return 1;
        else return 0;
    }
	
	
	
}
