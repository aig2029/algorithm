package algorithm;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Problem191121_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(String[] operations) {
		int[] answer = new int[2];

		PriorityQueue<Integer> minPq = new PriorityQueue<>();
		PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < operations.length; i++) {
			System.out.println("입력값 " + operations[i]);
			String op = operations[i];
			if (op.charAt(0) == 'I') {
				// System.out.println("input이다.");
				int value = Integer.parseInt(op.substring(2));

				minPq.offer(value);
				maxPq.offer(value);
			} else if (op.charAt(0) == 'D') {
				if (maxPq.isEmpty())
					continue;
				if (op.charAt(2) != '-') {
					int max = maxPq.peek();
					maxPq.remove(max);
					minPq.remove(max);
				} else {
					int min = minPq.peek();
					maxPq.remove(min);
					minPq.remove(min);
				}

			}

			printPQ(minPq);
			printPQ(maxPq);

			System.out.println();
		}

		// 		System.out.println();
		// 		while (!minPq.isEmpty()) {
		// 			System.out.println(minPq.poll());
		// 		}

		// 		System.out.println();
		// 		while (!maxPq.isEmpty()) {
		// 			System.out.println(maxPq.poll());
		// 		}

		System.out.println(maxPq.peek());
		System.out.println(minPq.peek());
		if (!maxPq.isEmpty()) {
			answer[0] = maxPq.peek();
			answer[1] = minPq.peek();
		}

		return answer;
	}

	void printPQ(PriorityQueue<Integer> pq) {
		Iterator it = pq.iterator();
		System.out.println("==================");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==================");
	}

	// 	class Element implements Comparable<Element> {
	// 		int index;
	// 		int value;

	// 		public Element(int index, int value) {
	// 			this.index = index;
	// 			this.value = value;
	// 		}

	// 		@Override
	// 		public int compareTo(Element e) {
	// 			if (this.value < e.value)
	// 				return -1;
	// 			else
	// 				return 1;
	// 		}

	// 		public String toString() {
	// 			return index + " " + value;
	// 		}
	// 	}

	
}
