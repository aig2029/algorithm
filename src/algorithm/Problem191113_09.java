package algorithm;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem191113_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	// 인간승리다
	public int solution(String[] lines) {
		int answer = 0;
		PriorityQueue<Double> startTimeList = new PriorityQueue<>();
		Queue<Double> endTimeList = new LinkedList<>();

		boolean firstFlag = true;
		BigDecimal firstTime = new BigDecimal("0");

		for (int i = 0; i < lines.length; i++) {

			String[] split = lines[i].split(" ");
			String[] timeStr = split[1].split(":");

			BigDecimal endTime = new BigDecimal("0");
			BigDecimal startTime = new BigDecimal("0");

			BigDecimal b0 = new BigDecimal(String.valueOf(timeStr[0]));
			BigDecimal b1 = new BigDecimal(String.valueOf(timeStr[1]));
			BigDecimal b2 = new BigDecimal(String.valueOf(timeStr[2]));

			b0 = b0.multiply(new BigDecimal("3600"));
			b1 = b1.multiply(new BigDecimal("60"));

			// System.out.println(b0);
			// System.out.println(b1);
			// System.out.println(b2);

			endTime = b0.add(b1.add(b2));
			if (firstFlag) {
				firstTime = endTime;
				firstFlag = false;
			}
			endTime = endTime.subtract(firstTime);

			BigDecimal T = new BigDecimal(split[2].substring(0, split[2].length() - 1));

			T = T.subtract(new BigDecimal("0.001"));
			System.out.println("T " + T);

			startTime = endTime.subtract(T);

			endTime = endTime.add(new BigDecimal("1"));
			startTimeList.offer(startTime.doubleValue());
			endTimeList.offer(endTime.doubleValue());

			System.out.println("상대 완료시간 :" + endTime);
			System.out.println("상대 시작시간 :" + startTime);

		}

		Queue<Double> q = new LinkedList<>();
		while (!startTimeList.isEmpty()) {
			Double now = startTimeList.poll();
			q.offer(now);
			while (true) {
				Double end = endTimeList.peek();
				if (end <= now) {
					endTimeList.poll();
					q.poll();
				}
				break;
			}

			if (q.size() > answer)
				answer = q.size();
		}
		return answer;
	}

	
}
