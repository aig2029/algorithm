package algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem191204_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[][] jobs) {
		int answer = 0;

		Arrays.sort(jobs, (a, b) -> Integer.compare(a[0], b[0]));

		PriorityQueue<Job> waitList = new PriorityQueue<>();
		Queue<Job> q = new LinkedList<>();

		for (int i = 0; i < jobs.length; i++) {
			System.out.println(jobs[i][0] + " " + jobs[i][1]);
			q.add(new Job(jobs[i][0], jobs[i][1]));
		}

		// System.out.println();
		// while(!q.isEmpty()){
		//     System.out.println(q.poll());
		// }

		if (jobs.length == 1)
			return jobs[0][1];

		int time = 0;
		Job now = null;

		while (true) {
			if (now == null) {
				if (waitList.isEmpty()) {
					now = q.poll();
					time = now.start;
				} else {
					now = waitList.poll();
				}
			} else {
				time += now.workTime;
				answer += (time - now.start);
				now = null;

				while (!q.isEmpty() && q.peek().start <= time) {
					waitList.add(q.poll());
				}

			}

			if (waitList.isEmpty() && q.isEmpty() && now == null)
				break;
		}

		answer /= jobs.length;

		return answer;
	}

	class Job implements Comparable<Job> {
		int start;
		int workTime;

		Job(int start, int workTime) {
			this.start = start;
			this.workTime = workTime;
		}

		@Override
		public int compareTo(Job j) {
			return Integer.compare(this.workTime, j.workTime);
		}

		public String toString() {
			return this.start + " " + this.workTime;
		}

	}

	
}
