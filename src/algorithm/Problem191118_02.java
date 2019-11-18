package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Problem191118_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[][] jobs) {
		int answer = 0;

		ArrayList<Job> arrList = new ArrayList<>();
		PriorityQueue<Job> pq = new PriorityQueue<>();

		for (int i = 0; i < jobs.length; i++) {
			arrList.add(new Job(jobs[i][0], jobs[i][1]));
		}

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

		Collections.sort(arrList, new Comparator<Job>() {
			@Override
			public int compare(Job j1, Job j2) {
				if (j1.requestTime < j2.requestTime)
					return -1;
				else if (j1.requestTime == j2.requestTime) {
					return 0;
				} else
					return 1;
			}
		});

		System.out.println();

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println();

		int time = 0;
		while (arrList.size() > 0) {
			if (arrList.get(0).requestTime == time) {
				while (arrList.size() > 0 && arrList.get(0).requestTime == time) {
					pq.offer(arrList.remove(0));
				}

			}

			else
				time++;
		}

		Iterator it = pq.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();

		// while(!pq.isEmpty()){
		//     System.out.println(pq.poll());
		// }

		return answer;
	}

	class Job implements Comparable<Job> {
		int requestTime;
		int executionTime;

		Job(int requestTime, int executionTime) {
			this.requestTime = requestTime;
			this.executionTime = executionTime;
		}

		 public String toString(){
            return requestTime+" "+executionTime;
        }
        
        @Override
        public int compareTo(Job j){
            if(this.executionTime<j.executionTime) return -1;
            else if(this.executionTime==j.executionTime) return 0;
            else return 1;
        }
    }

	
}
