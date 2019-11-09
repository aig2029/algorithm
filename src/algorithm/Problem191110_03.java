package algorithm;

import java.util.LinkedList;

public class Problem191110_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;

		if (cacheSize == 0)
			return cities.length * 5;

		LinkedList<String> linked = new LinkedList<>();

		for (int i = 0; i < cities.length; i++) {

			if (!linked.contains(cities[i].toLowerCase())) {
				answer += 5;

			} else {
				answer += 1;
				linked.remove(cities[i].toLowerCase());
			}
			if (linked.size() >= cacheSize)
				linked.remove(linked.get(cacheSize - 1));
			linked.add(0, cities[i].toLowerCase());

			// for(int j=0; j<linked.size(); j++){
			//     System.out.print(linked.get(j)+" ");
			// }
			// System.out.println();

			// System.out.println(cities[i]);
		}

		return answer;
	}

	
}
