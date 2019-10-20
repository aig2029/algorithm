package algorithm;

import java.util.ArrayList;

public class Problem191020_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		ArrayList<Integer> truckWeight_lists = new ArrayList<>();

		for (int i = 0; i < truck_weights.length; i++) {
			truckWeight_lists.add(truck_weights[i]);
		}

		System.out.println("트럭수" + truckWeight_lists.size());

		ArrayList<Integer> remain_distance = new ArrayList<>();

		for (int i = 0; i < truckWeight_lists.size(); i++) {
			remain_distance.add(bridge_length);
		}

		for (int i = 0; i < truckWeight_lists.size(); i++) {
			// System.out.println("트럭무게 : "+truckWeight_lists.get(i));
			// System.out.println("i 인자 : "+i);
			// System.out.println("남은거리 : "+remain_distance.get(i));
		}

		int currentWeight_onBridge = 0;
		int waitingTruckIdx = 0;

		boolean isLimited = false;
        boolean isFinalTruck = false;
		ArrayList<Integer> currentTruckIdx_onBridge = new ArrayList<>();

		

		int xxx = 0;
		//remain_distance.get(remain_distance.size()-1) != -1
		while (remain_distance.get(remain_distance.size()-1) != -100) {
			
			if (!isLimited && !isFinalTruck) {
				currentWeight_onBridge += truckWeight_lists.get(waitingTruckIdx);
				// System.out.println("다리 위 현재 트럭들무게 : " + currentWeight_onBridge);
				currentTruckIdx_onBridge.add(waitingTruckIdx);
                
                // indexOutOfRange exception방지용
                if(waitingTruckIdx < truckWeight_lists.size()-1) {
                    waitingTruckIdx++;
                }
                else if(waitingTruckIdx==truckWeight_lists.size()-1){
                    isFinalTruck=true;
                }
                    
                // 현재트럭들 + 대기중인트럭 더한 값이 한계 무게 초과할 경우
                if( 
                    currentWeight_onBridge+truckWeight_lists.get(waitingTruckIdx) > weight){
                    isLimited=true;
                }

			}

			// 시간 증가 후 트럭들 이동.
			answer++;
            // System.out.println(answer+"초 경과");
			for (int i = 0; i < currentTruckIdx_onBridge.size(); i++) {
				int pointedIdx = currentTruckIdx_onBridge.get(i);
				remain_distance.set(pointedIdx, remain_distance.get(pointedIdx) - 1);
                // System.out.println((pointedIdx+1)+"번 트럭의 남은거리 : "+remain_distance.get(pointedIdx));
                
				if (remain_distance.get(pointedIdx) == 0) {
					currentWeight_onBridge -= truckWeight_lists.get(pointedIdx);
					remain_distance.set(pointedIdx, -100);
                    
                    // System.out.println((pointedIdx+1)+"번 트럭 다리끝부분 도달. 몸통만통과하면됨");
                    currentTruckIdx_onBridge.remove(i--);
                    
                    if( !isFinalTruck &&
                        currentWeight_onBridge+truckWeight_lists.get(waitingTruckIdx) <= weight){
                        isLimited=false;   
                    }
				}
			}
            

		}
        
        System.out.println(answer);

		return answer+1;
	}
	
}
