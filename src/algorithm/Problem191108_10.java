package algorithm;

import java.util.HashMap;

public class Problem191108_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int solution(String str1, String str2) {
		int answer = 0;

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		HashMap<String, Integer> hm1 = new HashMap<>();
		HashMap<String, Integer> hm2 = new HashMap<>();

		for (int i = 0; i < str1.length() - 1; i++) {
			char fst = str1.charAt(i);
			char sec = str1.charAt(i + 1);

			if (fst >= 'a' && sec >= 'a' && fst <= 'z' && sec <= 'z') {
				String input = str1.substring(i, i + 2);
				if (!hm1.containsKey(input))
					hm1.put(input, 1);
				else
					hm1.put(input, hm1.get(input) + 1);
			}
		}

		for (int i = 0; i < str2.length() - 1; i++) {
			char fst = str2.charAt(i);
			char sec = str2.charAt(i + 1);

			if (fst >= 'a' && sec >= 'a' && fst <= 'z' && sec <= 'z') {
				String input = str2.substring(i, i + 2);
				if (!hm2.containsKey(input))
					hm2.put(input, 1);
				else
					hm2.put(input, hm2.get(input) + 1);
			}
		}

		int kyo = 0, hap = 0;

		for (String str : hm1.keySet()) {
			System.out.println(str + " " + hm1.get(str));
			hap += hm1.get(str);
		}

		System.out.println();
		for (String str : hm2.keySet()) {
			System.out.println(str + " " + hm2.get(str));
			hap += hm2.get(str);
		}

		for (String str : hm2.keySet()) {
			if (hm1.containsKey(str)) {
				kyo += Math.min(hm1.get(str), hm2.get(str));
				hap -= Math.min(hm1.get(str), hm2.get(str));
			}
		}

		System.out.println(kyo + " " + hap);
		if (hap == 0)
			answer = 65536;
		else {
			answer = (int) (((double) kyo / hap) * 65536);
		}

		return answer;
	}
	
}
