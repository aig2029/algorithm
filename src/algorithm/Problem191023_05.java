package algorithm;

import java.util.LinkedList;

public class Problem191023_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public class Document{
        int priority;
        int location;
        
        public Document(int priority, int location){
            this.priority = priority;
            this.location = location;
        }
        
        
    }
    
	public int solution(int[] priorities, int location) {

		LinkedList<Document> docuList = new LinkedList<>();
		for (int i = 0; i < priorities.length; i++) {
			docuList.add(new Document(priorities[i], i));
		}

		for (int i = 0; i < docuList.size(); i++) {
			Document docu = docuList.get(i);
			// System.out.println(docu.priority+" "+docu.location);
			for (int j = i + 1; j < docuList.size(); j++) {
				if (docu.priority < docuList.get(j).priority) {
					docuList.add(docu);
					docuList.remove(i);
					i--;
					break;

				}
			}
		}

		for (int i = 0; i < docuList.size(); i++) {
			Document docu = docuList.get(i);
			if (docu.location == location)
				return i + 1;
			System.out.println(docu.priority + " " + docu.location);
		}

		int answer = 0;

		return answer;
	}
	
	
}
