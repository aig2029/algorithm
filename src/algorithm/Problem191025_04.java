package algorithm;

import java.util.Arrays;

public class Problem191025_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] people = new int[] {70, 50, 80, 50};
		int limit = 100;
		
		int s = solution(people,limit);
		System.out.println(s);
	}
	
	public static int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        // for(int i=0; i<people.length; i++){
        //     System.out.println(people[i]);
        // }
        
        int j=0;
        for(int i=people.length-1; i>=0; i--){
            if(j==i) {
                answer++;
                break;
            }
            else if(j>i) break;
            else if(people[j]+people[i]>limit) answer++;
            else {
                answer++;
                j++;
            }
   
        }
        // list를 활용한 방법.. 효율성 테스트4에서 막힘
        
//		LinkedList<Integer> peopleList = new LinkedList<>();
//
//		for (int i = 0; i < people.length; i++) {
//			peopleList.add(people[i]);
//		}
//
//		Collections.sort(peopleList);
//		Collections.reverse(peopleList);
//
//		// for(int i=0; i<peopleList.size(); i++){
//		//     System.out.println(peopleList.get(i));
//		// }
//
//		while (peopleList.size() >= 1) {
//			if (peopleList.size() == 1) {
//				answer++;
//				peopleList.remove(0);
//				break;
//			}
//			if (peopleList.get(0) + peopleList.get(peopleList.size() - 1) > limit) {
//				answer++;
//				peopleList.remove(0);
//			} else {
//				answer++;
//				peopleList.remove(peopleList.size() - 1);
//				peopleList.remove(0);
//			}
//		}
        
        return answer;
	}

	
}
