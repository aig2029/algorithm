package algorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem191204_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int stock, int[] datesInput, int[] suppliesInput, int k) {
		int answer = 0;

		Queue<Integer> dates = new LinkedList<>();
		Queue<Integer> supplies = new LinkedList<>();

		for (int d : datesInput) {
			// System.out.println(d);
			dates.offer(d);
		}
		System.out.println();
		for (int s : suppliesInput) {
			// System.out.println(s);
			supplies.offer(s);
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int day = 0;
		while (day < k) {

			if (!dates.isEmpty() && dates.peek() == day) {
				dates.poll();
				pq.add(supplies.poll());
			}

			if (stock == 0) {
				answer++;
				stock += pq.poll();
			}
			stock--;
			day++;

		}

		return answer;
	}

	
}
