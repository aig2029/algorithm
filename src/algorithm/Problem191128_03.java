package algorithm;

import java.util.ArrayList;

public class Problem191128_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static StringBuilder sb;
	static ArrayList<int[]> route = new ArrayList<>();

	public int[][] solution(int n) {

		sb = new StringBuilder();
		moveHanoi(n, 1, 2, 3);

		int[][] answer = new int[route.size()][2];

		for (int i = 0; i < route.size(); i++) {
			answer[i][0] = route.get(i)[0];
			answer[i][1] = route.get(i)[1];
		}

		return answer;
	}

	void moveHanoi(int diskNum, int start, int buffer, int end) {
		if (diskNum == 1) {
			// System.out.println(start+" "+end);
			route.add(new int[] { start, end });
			sb.append(Integer.toString(start) + Integer.toString(end));
		}

		else {
			moveHanoi(diskNum - 1, start, end, buffer);
			// moveHanoi(1,start,buffer,end);
			// System.out.println(start+" "+end);
			route.add(new int[] { start, end });
			sb.append(Integer.toString(start) + Integer.toString(end));
			moveHanoi(diskNum - 1, buffer, start, end);
		}

	}

	
}
