package algorithm;

import java.util.Collections;
import java.util.PriorityQueue;

public class Problem191126_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public long solution1(int n, int[] works) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		long answer = 0;
		long sum = 0;

		for (int i = 0; i < works.length; i++) {
			pq.add(works[i]);
			sum += works[i];
		}
		if (sum - n <= 0)
			return 0;

		while (true) {
			int now = pq.poll();
			pq.add(now - 1);
			if (n-- == 1)
				break;
		}

		while (!pq.isEmpty()) {
			int now = pq.poll();
			answer += (now * now);
			// System.out.println(pq.poll());
		}

		return answer;
	}
	
	// fail
	public long solution(int n, int[] works) {
		long answer = 0;

		// Arrays.sort(works);

		long sum = 0;
		int leng = works.length;

		for (int i = 0; i < works.length; i++) {
			sum += works[i];
			// System.out.println(works[i]);
		}
		long minSum = sum - n; // 일 총합에서 야근뺀것.. 이걸로 야근지수 만듬..
		long aver = minSum / leng;

		if (minSum <= 0)
			return 0;

		// System.out.println();
		// System.out.println(minSum);
		// System.out.println(aver);
		// System.out.println(aver*leng);

		long plusOneCount = minSum - aver * leng;

		answer = (aver * aver) * (leng - plusOneCount) + (aver + 1) * (aver + 1) * (plusOneCount);
		// System.out.println(leng-plusOneCount);
		// System.out.println(plusOneCount);

		return answer;
	}

	
}
