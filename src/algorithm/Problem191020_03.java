package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Problem191020_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] d, int budget) {
		int answer = 0;

		ArrayList<Integer> arrList = new ArrayList<>();

		for (int i = 0; i < d.length; i++) {
			arrList.add(d[i]);
		}

		Collections.sort(arrList);

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
			if (arrList.get(i) <= budget) {
				budget -= arrList.get(i);
				answer++;
			}
		}

		return answer;
	}
	
}
