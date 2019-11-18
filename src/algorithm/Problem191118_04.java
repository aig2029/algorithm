package algorithm;

import java.util.Arrays;

public class Problem191118_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[][] routes) {
		int answer = 0;

		Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));

		// for(int i=0; i<routes.length; i++){
		//     System.out.println(routes[i][0]+" "+routes[i][1]);
		// }
		int min = Integer.MIN_VALUE;

		for (int[] route : routes) {
			if (min < route[0]) {
				min = route[1];
				answer++;
			}
		}

		return answer;
	}

	
}
