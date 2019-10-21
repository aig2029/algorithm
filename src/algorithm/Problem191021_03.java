package algorithm;

import java.util.ArrayList;

public class Problem191021_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}	
	
	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};

		int[] requiredTaskDays = new int[progresses.length];

		for (int i = 0; i < progresses.length; i++) {
			int remainWorkload = 100 - progresses[i];
			if (remainWorkload % speeds[i] == 0)
				requiredTaskDays[i] = remainWorkload / speeds[i];
			else {
				requiredTaskDays[i] = (remainWorkload / speeds[i]) + 1;
			}
		}

		int distribuedTaskStandard = requiredTaskDays[0];
		int i = 1;
		int count = 1;
		ArrayList<Integer> countList = new ArrayList<>();

		while (i < requiredTaskDays.length) {
			if (requiredTaskDays[i] <= distribuedTaskStandard) {
				count++;
			} else {
				distribuedTaskStandard = requiredTaskDays[i];
				countList.add(count);
				count = 1;
			}
			if (++i == requiredTaskDays.length)
				countList.add(count);
		}

		for (int j = 0; j < requiredTaskDays.length; j++) {

			System.out.println(requiredTaskDays[j]);
		}
		System.out.println();
		answer = new int[countList.size()];
		for (int j = 0; j < countList.size(); j++) {
			System.out.println(countList.get(j));
			answer[j] = countList.get(j);
		}

		return answer;
	}
}
