package algorithm;

import java.util.HashMap;

public class Problem191026_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 유일하게 안보고 내 손으로 품 
	public int solution(String[][] clothes) {
		int answer = 0;

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < clothes.length; i++) {
			// System.out.println(clothes[i][0]);
			// System.out.println(clothes[i][1]);
			if (hm.containsKey(clothes[i][1])) {
				hm.put(clothes[i][1], hm.get(clothes[i][1]) + 1);
			} else
				hm.put(clothes[i][1], 1);

		}

		System.out.println();
		int total = 1;
		for (String string : hm.keySet()) {

			System.out.println(string);
			System.out.println(hm.get(string));
			total *= (hm.get(string) + 1);
		}

		return total - 1;
	}

	
}
