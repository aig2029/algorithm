package algorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Problem191201_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] priorities, int location) {
		int answer = 0;

		LinkedList<Document> waitList = new LinkedList<>();
		LinkedList<Document> compList = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < priorities.length; i++) {
			// System.out.print(priorities[i]+" ");
			pq.add(priorities[i]);

			waitList.add(new Document(i, priorities[i]));

		}
		// System.out.println();
		// System.out.println(pq.size()+" "+waitList.size());
		// System.out.println(pq.peek());
		// System.out.println(waitList.get(0).priority);

		int index = 0;

		while (true) {
			if (waitList.size() == 0)
				break;
			int max = pq.peek();
			if (max == waitList.get(0).priority) {
				pq.poll();
				compList.add(waitList.remove(0));
			} else {
				waitList.add(waitList.remove(0));
			}
		}
		//         while(waitList.size()>0){
		//             int max = pq.peek();
		//             if(max==waitList.get(index).priority){
		//                 System.out.println(pq.poll());
		//                 index++;
		//                 System.out.println("사이즈는.."+ pq.size()+" "+waitList.size());
		//             }
		//             else{
		//                 Document doc0 = waitList.remove(0);
		//                 compList.add(doc0);
		//             }

		//         }

		// while(!pq.isEmpty()){
		//     System.out.print(pq.poll()+" ");
		// }

		// System.out.println();
		// for(int i=0; i<waitList.size(); i++){
		//     System.out.println(waitList.get(i).priority+" "+waitList.get(i).index);
		// }

		for (int i = 0; i < compList.size(); i++) {
			// System.out.println(compList.get(i).priority+" "+compList.get(i).index);
			if (compList.get(i).index == location) {
				return i + 1;
			}
		}

		return answer;
	}

	class Document {
		int index;
		int priority;

		// index is location.
		Document(int index, int priority) {
			this.index = index;
			this.priority = priority;
		}
	}

	
}
