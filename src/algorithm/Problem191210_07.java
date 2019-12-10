package algorithm;

import java.util.HashSet;

public class Problem191210_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		
		
	}
	
	public int solution(int[] A) {
		// write your code in Java SE 8

		HashSet<Integer> hs = new HashSet<>();

		for (int a : A)
			hs.add(a);

		int v = 0;
		for (int i = 0; i < A.length; i++) {
			v++;
			if (hs.remove(v))
				continue;
			else
				return v;

		}

		return ++v;

	}

	
}
