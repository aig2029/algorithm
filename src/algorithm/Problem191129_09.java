package algorithm;

import java.util.HashMap;

public class Problem191129_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String[][] clothes) {
		int answer = 1;

		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < clothes.length; i++) {
			String kind = clothes[i][1];
			if (!hm.containsKey(kind))
				hm.put(kind, 1);
			else
				hm.put(kind, hm.get(kind) + 1);
		}

		if (hm.size() == 1) {
			for (String key : hm.keySet()) {
				return hm.get(key);
				// System.out.println(key+" "+hm.get(key));
			}
		} else {
			for (String key : hm.keySet()) {
				answer *= (hm.get(key) + 1);
				// System.out.println(key+" "+hm.get(key));
			}

		}
		answer--;

		return answer;
	}

	
}
