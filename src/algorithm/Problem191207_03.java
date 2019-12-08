package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Problem191207_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] citationsInput) {
		int answer = 0;

		ArrayList<Integer> citations = new ArrayList<>();
		for (int c : citationsInput) {
			citations.add(c);
		}

		Collections.sort(citations);
		Collections.reverse(citations);

		int accum = 0;
		for (int c : citations) {
			if (accum >= c)
				return accum;
			accum++;
			// System.out.println(c);
		}

		return accum;
	}

	
}
