package algorithm;

import java.util.ArrayList;

public class Problem191020_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		ArrayList<Integer> truckWeightsList = new ArrayList<>();
		ArrayList<Integer> remainDistance = new ArrayList<>();
		ArrayList<Integer> movingTruckIdx = new ArrayList<>();

		for (int i = 0; i < truck_weights.length; i++) {
			truckWeightsList.add(truck_weights[i]);
			System.out.println(truckWeightsList.get(i));
			remainDistance.add(bridge_length);
		}

		boolean isLimited = false;
		boolean isFinalTruck = false;

		int totalTruckWeight = 0;
		int waitingTruckIdx = 0;

		int xxx = 0;
		// remainDistance.get(remainDistance.size()-1) != -100

		while (remainDistance.get(remainDistance.size() - 1) != -100) {
			if (!isLimited && !isFinalTruck) {
				totalTruckWeight += truckWeightsList.get(waitingTruckIdx);
				movingTruckIdx.add(waitingTruckIdx);

				if (waitingTruckIdx == truckWeightsList.size() - 1)
					isFinalTruck = true;
				else {
					if (totalTruckWeight + truckWeightsList.get(waitingTruckIdx + 1) > weight)
						isLimited = true;
					waitingTruckIdx++;
				}
			}

			answer++;
			// System.out.println(answer+"초 경과");
			// System.out.println("트럭 총 무게 : " +totalTruckWeight);

			for (int i = 0; i < movingTruckIdx.size(); i++) {
				int pointedIdx = movingTruckIdx.get(i);
				remainDistance.set(pointedIdx, remainDistance.get(pointedIdx) - 1);
				// System.out.println( (pointedIdx+1)+"번 트럭 "+remainDistance.get(pointedIdx)+"거리 남음" );

				if (remainDistance.get(pointedIdx) == 0) {
					remainDistance.set(pointedIdx, -100);
					totalTruckWeight -= truckWeightsList.get(pointedIdx);
					movingTruckIdx.remove(i--);
					// System.out.println((pointedIdx+1)+"번 트럭 다리끝까지 도착했고 몸통만 통과하면됨");

					if (!isFinalTruck && totalTruckWeight + truckWeightsList.get(waitingTruckIdx) <= weight) {
						isLimited = false;
					}

				}
			}
		}

		return answer + 1;
	}
	
}
