package algorithm;

import java.util.ArrayList;

public class Problem191108_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		
	}
	
	public int[] solution(int n, String[] words) {

		ArrayList<String> arrList = new ArrayList<>();

		int rotationNum = 0;
		int failNum = 0;
		String first = "", last = "";
		for (int i = 0; i < words.length; i++) {
			// System.out.println(words[i]);
			first = words[i].substring(0, 1);

			if (i != 0 && !first.equals(last)) {
				failNum = (i % n) + 1;
				rotationNum = (i / n) + 1;
				break;
			}
			if (arrList.contains(words[i])) {
				failNum = (i % n) + 1;
				rotationNum = (i / n) + 1;
				break;
			}

			//             System.out.println(first);
			//             System.out.println(last);

			last = words[i].substring(words[i].length() - 1);
			arrList.add(words[i]);
		}
		//         System.out.println(failNum);
		//         System.out.println(rotationNum);

		//         for(String str : arrList){
		//             System.out.println(str);
		//         }

		int[] answer = new int[2];
		answer[0] = failNum;
		answer[1] = rotationNum;
		return answer;
	}

	
}
