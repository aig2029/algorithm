package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Problem191113_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String[] lines) {
		int answer = 0;
		Queue<Double> startTime = new LinkedList<>();
		Queue<Double> endTime = new LinkedList<>();

		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
			String[] split = lines[i].split(" ");
			String[] timeStr = split[1].split(":");

			double time = 0;
			// System.out.println(time[2]);

			double s = Double.parseDouble(timeStr[2]);
			double t = Double.parseDouble(split[2].substring(0, split[2].length() - 1));
			t -= 0.001;
			t = Math.round(t * 1000) / 1000.0;

			System.out.println(s);
			System.out.println(t);

			// System.out.println("시작시간 ");
			// System.out.println(s-t);
			// System.out.println("완료시간");
			// System.out.println(s);
			// System.out.println("응답시간");
			// System.out.println(t);

			startTime.offer((double) Math.round((s - t) * 1000) / 1000);
			endTime.offer(s + 1.000);

		}

		Queue<Double> q = new LinkedList<>();
		while (!startTime.isEmpty()) {
			Double now = startTime.poll();
			q.offer(now);
			while (true) {
				Double end = endTime.peek();
				System.out.println("end " + end);
				System.out.println("now " + now);
				if (end <= now) {
					endTime.poll();
					q.poll();
				} else
					break;
			}
			if (q.size() > answer)
				answer = q.size();
		}

		// System.out.println(startTime.size());
		// System.out.println(answer);

		return answer;
	}

	Double mathRound(Double input) {
		return Math.round(input * 1000) / 1000.0;
	}

	
}
