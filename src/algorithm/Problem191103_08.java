package algorithm;

import java.util.Collections;
import java.util.PriorityQueue;

public class Problem191103_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int days=0;
        int i=0;
        
        while(days<k){
            
            
            if(i<dates.length && dates[i]==days) {
                pq.offer(supplies[i]);
                i++;
            }
            
            if(stock==0){
                // System.out.println(days+ " "+stock+" "+ pq.peek());
                stock+=pq.poll();
                answer++;
            }
            stock--;
            days++;
            
        }
        
        return answer;
    }

	
}
