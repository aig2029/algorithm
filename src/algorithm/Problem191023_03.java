package algorithm;

import java.util.Stack;

public class Problem191023_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			
			Stack<Integer> st = new Stack<>();
			for (int j = i + 1; j < prices.length; j++) {
				st.push(1);
				if (prices[i] > prices[j] || j == prices.length - 1) {
					answer[i] = st.size();
					break;
				}

			}
			// answer[i]++;
		}

		return answer;
	}
	
	
	
}
