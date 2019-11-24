package algorithm;

import java.util.Arrays;

public class Problem191124_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] weight) {
		int answer = 0;

		Arrays.sort(weight);

		int accum = weight[0];
		if (accum != 1)
			return 1;

		for (int i = 1; i < weight.length - 1; i++) {
			accum += weight[i];
			// System.out.println(accum+" " +weight[i]);
			if (accum + 1 >= weight[i + 1])
				continue;
			else
				return accum + 1;
		}

		return accum + weight[weight.length - 1] + 1;

	}

	
}
