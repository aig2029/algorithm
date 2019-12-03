package algorithm;

import java.util.ArrayList;

public class Problem191204_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int[] progresses, int[] speeds) {

		ArrayList<Integer> answerList = new ArrayList<>();
		int[] days = new int[progresses.length];

		for (int i = 0; i < days.length; i++) {
			days[i] = (100 - progresses[i]) / speeds[i];
			days[i] = ((100 - progresses[i]) % speeds[i] > 0) ? days[i] + 1 : days[i];

			// System.out.println(days[i]);
		}

		if (days.length == 1)
			return new int[] { 1 };

		int i = 1;
		int tempMax = days[0];
		int accum = 1;

		while (i < days.length) {
			if (tempMax < days[i]) {
				answerList.add(accum);
				accum = 1;
				tempMax = days[i];
			} else
				accum++;

			if (i == days.length - 1)
				answerList.add(accum);
			i++;
		}

		int[] answer = new int[answerList.size()];
		for (int j = 0; j < answer.length; j++) {
			answer[j] = answerList.get(j);
			// System.out.println(a);
		}

		return answer;
	}

	
}
