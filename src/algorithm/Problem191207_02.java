package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem191207_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(int[] numbers) {
		String answer = "";

		List<String> arr = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			// System.out.println(numbers[i]);
			arr.add(Integer.toString(numbers[i]));
		}

		Collections.sort(arr, (a, b) -> -Integer.compare(Integer.parseInt(a + b), Integer.parseInt(b + a)));
		// System.out.println();
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
			// System.out.println(s);
		}
		answer = sb.toString();
		if (answer.charAt(0) == '0')
			return "0";

		return answer;
	}

	
}
