package algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Problem191118_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[][] jobs) {
		int answer = 0;

		List<Job> jobsList = new LinkedList<>();
		PriorityQueue<Job> pq = new PriorityQueue<>();
		for (int i = 0; i < jobs.length; i++) {
			int a = jobs[i][0];
			int b = jobs[i][1];
			pq.offer(new Job(a, b));
		}

		for (int i = 0; i < jobs.length; i++) {
			jobsList.add(pq.poll());
		}

		for (int i = 0; i < jobsList.size(); i++) {
			System.out.println(jobsList.get(i));
		}

		int time = 0;
		int sum = 0;

		while (jobsList.size() > 0) {

			for (int i = 0; i < jobsList.size(); i++) {
				if (jobsList.get(i).requestTime <= time) {
					Job job = jobsList.remove(i);

					time += job.executionTime;
					sum += time - job.requestTime;

					break;
				}
				if (i == jobsList.size() - 1)
					time++;
			}

		}

		//         Loop1: while(jobsList.size()>0){
		//             if(jobsList.get(0).requestTime<=time){
		//                 System.out.println("현재 시간은 "+time);
		//                 while(jobsList.get(0).requestTime==time){
		//                     pq.offer(jobsList.remove(0));
		//                     if(jobsList.size()==0) break;
		//                 }

		//                 Iterator it = pq.iterator();
		//                 while(it.hasNext()){
		//                     System.out.println(it.next());
		//                 }

		//             }
		//             else time++;

		//             // 여기서 해주면되는데
		//             // Job inProgressJob = pq.poll();
		//         }

		return sum / jobs.length;
	}

	class Job implements Comparable<Job> {
		int requestTime;
		int executionTime;

		Job(int requestTime, int executionTime) {
			this.requestTime = requestTime;
			this.executionTime = executionTime;
		}

		public String toString() {
			return requestTime + " " + executionTime;
		}

		@Override
		public int compareTo(Job j) {
			if (this.executionTime < j.executionTime)
				return -1;
			else if (this.executionTime == j.executionTime) {
				if (this.requestTime < j.requestTime)
					return -1;
				else
					return 1;
			} else
				return 1;
		}

	}

	
}
