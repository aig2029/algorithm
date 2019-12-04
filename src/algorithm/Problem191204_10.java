package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Problem191204_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int a = commands[i][0] - 1;
			int b = commands[i][1] - 1;
			ArrayList<Integer> arr = new ArrayList<>();

			for (int j = a; j <= b; j++) {
				arr.add(array[j]);
			}

			Collections.sort(arr);

			answer[i] = arr.get(commands[i][2] - 1);

			// for(int k : arr){
			//     System.out.println(k);
			// }
			// System.out.println("====");

		}

		return answer;
	}

	
}
