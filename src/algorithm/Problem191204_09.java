package algorithm;

import java.util.Collections;
import java.util.PriorityQueue;

public class Problem191204_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	}
	
	public int[] solution(String[] operations) {
		int[] answer = new int[2];

		PriorityQueue<Integer> minPQ = new PriorityQueue<>();
		PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < operations.length; i++) {
			// System.out.println(operations[i]);
			if (operations[i].charAt(0) == 'I') {
				int input = Integer.parseInt(operations[i].substring(2));
				minPQ.add(input);
				maxPQ.add(input);

			} else if (operations[i].charAt(0) == 'D') {
				if (operations[i].charAt(2) == '-') {
					if (!minPQ.isEmpty())
						maxPQ.remove(minPQ.poll());
				} else {
					if (!maxPQ.isEmpty())
						minPQ.remove(maxPQ.poll());
				}

			}

		}

		if (!maxPQ.isEmpty()) {
			answer[0] = maxPQ.poll();
			answer[1] = minPQ.poll();
		}

		return answer;
	}
	
}
