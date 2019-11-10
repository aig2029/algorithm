package algorithm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Problem191110_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	// /클라스가 다른 코드.. 실패코드에 비해 속도 약 20배.. 
	boolean check(String[][] relation, int rowsize, int colsize, int subset) {
		for (int a = 0; a < rowsize - 1; ++a) {
			for (int b = a + 1; b < rowsize; ++b) {
				boolean isSame = true;
				for (int k = 0; k < colsize; ++k) {
					if ((subset & 1 << k) == 0)
						continue;
					if (relation[a][k].equals(relation[b][k]) == false) {
						isSame = false;
						break;
					}
				}
				if (isSame)
					return false;
			}
		}
		return true;
	}

	public int solution(String[][] relation) {
		int answer = 0;
		int rowsize = relation.length;
		int colsize = relation[0].length;

		List<Integer> candidates = new LinkedList<>();

		for (int i = 1; i < 1 << colsize; ++i) {
			if (check(relation, rowsize, colsize, i) == true) {
				candidates.add(i);
			}
		}

		while (candidates.size() != 0) {
			int n = candidates.remove(0);
			++answer;

			for (Iterator<Integer> it = candidates.iterator(); it.hasNext();) {
				int c = it.next();
				if ((n & c) == n) {
					it.remove();
				}
			}
		}

		return answer;
	}

	
}
