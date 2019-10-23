package algorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Problem191024_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	// 직접짠 코드 우선순위큐를 몰라서 직접 값을 다 비교하니까
	// 효율성 test에서 다틀렷다
	public int solution(int[] scoville, int K) {
        int answer = 0;
        
        LinkedList<Integer> scovList = new LinkedList<>();
        
        for(int i=0; i< scoville.length; i++){
            
            scovList.add(scoville[i]);
            // System.out.println(scovList.get(i));
        }
        
        // System.out.println();
        Collections.sort(scovList);
        
        
        
        
        boolean moreThanScoville = false;
        
        while(true){
            
            //  for(int i=0; i< scovList.size(); i++){   
            //     System.out.println(scovList.get(i));
            //  }   
            // System.out.println();
            
            if(2<=scovList.size()){
                int newScov = scovList.get(0)+scovList.get(1)*2;
                // System.out.println("새로운 scov지수" + newScov);
                scovList.remove(0);
                scovList.remove(0);
                if(scovList.size()==0){
                    scovList.add(newScov);
                    break;
                }
                answer++;

                int k=0;
                while(k<scovList.size()){
                    if(k==scovList.size()-1) {
                        scovList.add(newScov);
                        // System.out.println("ㄱ");
                        break;
                    }
                    if(newScov <= scovList.get(k)) {
                        scovList.add(k,newScov);
                         // System.out.println("ㄴ");
                        break;
                    }
                    k++;
                }
            }
            
            
            if(scovList.get(0)>=K) {
                System.out.println("ㄹ");
                moreThanScoville =true;
                break;
            }
        }
        
       
        

        
        if(moreThanScoville){
            return answer;
        }
        else return -1;
        
    }
	
//	 우선순위큐로 하면 이 문제에서 걱정한거 싹 다 날려버리기 가능
	public int solution1(int[] scoville, int K) {
        
        // 우선순위큐는 오름차순이 기본인 것 같다
		PriorityQueue<Integer> priq = new PriorityQueue<>();
		// 우선순위큐 내림차순은 밑에 collections.reverseOrder를 comparator로 첨가해주면 된다.
//		PriorityQueue<Integer> priq = new PriorityQueue<>(Collections.reverseOrder());
        
        int answer = 0;
        
        for(int i : scoville) priq.add(i);
        
        while(true){
            if(priq.peek()>=K) {
                return answer;
            }
            else if(priq.size()==1) return -1;
            else {
                priq.add(priq.remove()+(priq.remove()*2));
                answer++;
            }
            
            
        }
    }

	
}
