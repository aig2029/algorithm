package algorithm;

import java.util.Stack;

public class Problem191213_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
    public int solution(int[] H) {
        // write your code in Java SE 8
        
        Stack<Integer> st = new Stack<>();
        
        int answer = 0;
        
        for(int h : H){
            while(!st.isEmpty() && st.peek()>h){
                st.pop();
            }
            
            if(st.isEmpty() || st.peek()<h){
                st.push(h);
                answer++;
            }
        }
        
        return answer;
    }

	
}
