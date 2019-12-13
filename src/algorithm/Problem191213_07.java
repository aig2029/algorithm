package algorithm;

import java.util.Stack;

public class Problem191213_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        
        Stack<Integer> st = new Stack<>();
                
        for(int i=A.length-1; i>=0 ; i--){
            if(st.isEmpty()) st.push(i);
            else {
                while(true){
                    if( B[st.peek()] == 0 && B[i] ==1 ){
                        if(A[i]>A[st.peek()]) st.pop();
                        else break;
                    }
                    else {
                        st.push(i);
                        break;
                    }
                    if(st.isEmpty()) {
                        st.push(i);
                        break;
                    }
                }
                
            }
        }
        
        return st.size();
        
    }

	
}
