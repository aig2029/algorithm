package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Problem191020_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public class Truck{
		int weight;
		int move;
		
		public Truck(int weight) {
			this.weight = weight;
			this.move = 1;
		}
		
		public void moving() {
			move++;
		}
	}
	
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Truck> waitQ = new LinkedList<>();
        Queue<Truck> movingQ = new LinkedList<>();
        
        for (int t : truck_weights) {
        	waitQ.offer(new Truck(t));
        }
        
        int totalWeightOnBridge = 0;
        
        while( !waitQ.isEmpty() || !movingQ.isEmpty() ) {
        	if(movingQ.isEmpty()) {
        		Truck t = waitQ.poll();
        		totalWeightOnBridge += t.weight;
        		movingQ.offer(t);
        		continue;
        	}
        	
        	for(Truck t : movingQ) {
        		t.moving();
        	}
        	
        	if(movingQ.peek().move > bridge_length) {
        		Truck t = movingQ.poll();
        		totalWeightOnBridge -= t.weight;
        	}
        	
        	if(!waitQ.isEmpty() && totalWeightOnBridge + waitQ.peek().weight <= weight ) {
        		
        		Truck t = waitQ.poll();
        		totalWeightOnBridge += t.weight;
        		movingQ.offer(t);
        	}
        	
        }
        
        return answer;
    }
}
