package algorithm;

import java.util.HashMap;

public class Problem190925_0 {

	public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> parti = new HashMap<String,Integer>();
        for (int i = 0; i < participant.length; i++) {
        	String player = participant[i];
        	if(parti.containsKey(player)) {
        		parti.put(player,parti.get(player)+1);
        	}
        	else parti.put(player, 1);
        	
		}
        System.out.println(parti);
        
        for (int i = 0; i < completion.length; i++) {
        	String completedPlayer = completion[i]; 
//        	parti.put(completedPlayer,parti.get(completedPlayer)-1);
        	if(parti.get(completedPlayer)==1) {
        		parti.remove(completedPlayer);
        	}
        	else parti.put(completedPlayer,parti.get(completedPlayer)-1);
		}
        
        System.out.println(parti);
        
        for (String string : parti.keySet()) {
			System.out.println(string);
		}
        
//        answer=parti.containsValue(1);
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
