package algorithm;

import java.util.Stack;

public class Problem191204_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int[] prices) {

		int[] answer = new int[prices.length];

		Stack<Integer> priceSt = new Stack<>();
		Stack<Integer> indexSt = new Stack<>();

		priceSt.push(prices[0]);
		indexSt.push(0);

		for (int i = 1; i < prices.length; i++) {
			while (true) {
				if (!priceSt.isEmpty() && priceSt.peek() > prices[i]) {
					int idx = indexSt.pop();
					priceSt.pop();
					answer[idx] = i - idx;
				} else
					break;

			}

			priceSt.push(prices[i]);
			indexSt.push(i);

		}

		while (!priceSt.isEmpty()) {
			int idx = indexSt.pop();
			priceSt.pop();
			answer[idx] = (prices.length - 1) - idx;
		}

		// for(int i : answer){
		//     System.out.println(i);
		// }

		return answer;
	}

	
}
