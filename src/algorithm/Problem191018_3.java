package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Problem191018_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		ArrayList<Integer> arrList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0)
				arrList.add(arr[i]);
		}

		Collections.sort(arrList);

		if (arrList.size() == 0) {
			answer = new int[] { -1 };

		} else {
			answer = new int[arrList.size()];

			for (int i = 0; i < arrList.size(); i++) {
				answer[i] = arrList.get(i);
			}
		}
		return answer;

	}

}
