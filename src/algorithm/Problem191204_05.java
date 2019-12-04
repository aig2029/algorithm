package algorithm;

import java.util.PriorityQueue;

public class Problem191204_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int s : scoville)
			pq.add(s);

		int a, b;

		while (pq.size() > 1) {
			// System.out.println("피큐픽" +pq.peek());
			if (pq.peek() >= K)
				return answer;
			a = pq.poll();
			b = pq.poll();
			// System.out.println(a+" "+b);
			pq.add(a + 2 * b);
			answer++;
		}
		if (pq.isEmpty())
			return -1;
		if (pq.peek() >= K)
			return answer;
		else
			return -1;

	}

}
