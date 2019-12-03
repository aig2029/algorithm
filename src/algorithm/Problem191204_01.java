package algorithm;

import java.util.ArrayList;

public class Problem191204_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int weightOnBridge = 0;

		ArrayList<Truck> inList = new ArrayList<>();
		ArrayList<Truck> outList = new ArrayList<>();

		for (int w : truck_weights)
			outList.add(new Truck(w, 0));

		while (true) {
			if (!inList.isEmpty() && inList.get(0).distance == bridge_length) {
				weightOnBridge -= inList.get(0).weight;
				inList.remove(0);
			}
			if (!outList.isEmpty() && outList.get(0).weight + weightOnBridge <= weight) {
				weightOnBridge += outList.get(0).weight;
				inList.add(outList.remove(0));
			}

			for (Truck t : inList)
				t.distance++;
			answer++;

			if (inList.isEmpty() && outList.isEmpty())
				break;

		}

		return answer;
	}

	class Truck {
		int weight;
		int distance;

		Truck(int weight, int distance) {
			this.weight = weight;
			this.distance = distance;
		}
	}

	
}
