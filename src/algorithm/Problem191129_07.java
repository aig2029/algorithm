package algorithm;

import java.util.HashMap;

public class Problem191129_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		HashMap<String, Integer> hm = new HashMap<>();

		for (String p : participant) {
			if (!hm.containsKey(p))
				hm.put(p, 1);
			else {
				hm.put(p, hm.get(p) + 1);
			}
		}

		//         for(String s : hm.keySet()){
		//             System.out.println(s+" "+hm.get(s));
		//         }

		for (String c : completion) {
			if (hm.get(c) == 1)
				hm.remove(c);
			else {
				hm.put(c, hm.get(c) - 1);
			}
		}

		// System.out.println();
		for (String s : hm.keySet()) {
			// System.out.println(s+" "+hm.get(s));
			return s;
		}

		return answer;

		// System.out.println(hm.size());

		// return answer;
	}

	
}
