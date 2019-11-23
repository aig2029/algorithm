package algorithm;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Problem191121_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 실패
	public int[] solution(String[] operations) {
		int[] answer = new int[2];

		PriorityQueue<Element> minPq = new PriorityQueue<>();
		PriorityQueue<Element> maxPq = new PriorityQueue<>(Collections.reverseOrder());

		int count = 0;
		int minDelNum = 0;
		int maxDelNum = 0;

		for (int i = 0; i < operations.length; i++) {
			System.out.println("입력값 " + operations[i]);
			String op = operations[i];
			if (op.charAt(0) == 'I') {
				// System.out.println("input이다.");
				int value = Integer.parseInt(op.substring(2));

				count++;
				minPq.offer(new Element(count, value));
				maxPq.offer(new Element(count, value));
			} else if (op.charAt(0) == 'D') {
				if (op.charAt(2) == '1') {
					if (!maxPq.isEmpty()) {
						maxPq.poll();
						maxDelNum++;

					} else {
						minPq.clear();
					}
				} else {
					if (!minPq.isEmpty()) {
						minPq.poll();
						minDelNum++;
					} else {
						maxPq.clear();
					}
				}

				if (minDelNum + maxDelNum >= count) {
					count = 0;
					minPq.clear();
					maxPq.clear();
					maxDelNum = 0;
					minDelNum = 0;
				}
			}

			printPQ(minPq);
			printPQ(maxPq);
			System.out.println("count " + count);
			System.out.println("minDelNum " + minDelNum);
			System.out.println("maxDelNum " + maxDelNum);
			System.out.println();
		}

		System.out.println();
		while (!minPq.isEmpty()) {
			System.out.println(minPq.poll());
		}

		System.out.println();
		while (!maxPq.isEmpty()) {
			System.out.println(maxPq.poll());
		}

		return answer;
	}

	void printPQ(PriorityQueue<Element> pq) {
		Iterator it = pq.iterator();
		System.out.println("==================");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==================");
	}

	class Element implements Comparable<Element> {
		int index;
		int value;

		public Element(int index, int value) {
			this.index = index;
			this.value = value;
		}

		@Override
		public int compareTo(Element e) {
			if (this.value < e.value)
				return -1;
			else
				return 1;
		}

		public String toString() {
			return index + " " + value;
		}
	}

	
}
