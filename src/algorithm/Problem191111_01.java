package algorithm;

import java.util.ArrayList;

public class Problem191111_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 후보키 스스로품
	public int solution(String[][] relation) {
		int answer = 0;
		int rowSize = relation.length;
		int colSize = relation[0].length;

		ArrayList<Integer> candidatesList = new ArrayList<>();

		for (int i = 0; i < relation.length; i++) {
			for (int j = 0; j < relation[0].length; j++) {
				System.out.print(relation[i][j] + " ");
			}
			System.out.println();
		}

		// for(int i=0; i<colSize; i++){
		//     System.out.println((int)Math.pow(2,i));
		// }

		Loop1: for (int idxComb = 1; idxComb < (int) Math.pow(2, colSize); idxComb++) {
			System.out.println(Integer.toBinaryString(idxComb));
			ArrayList<String> dupliChecker = new ArrayList<>();

			for (int i = 0; i < rowSize; i++) {

				String input = "";
				for (int j = 0; j < colSize; j++) {
					int compareIdxComb = (int) Math.pow(2, j);
					if ((idxComb & compareIdxComb) != 0)
						input += (relation[i][j] + " ");
				}
				if (dupliChecker.contains(input))
					continue Loop1;
				else {
					dupliChecker.add(input);
				}
			}
			for (Integer candidates : candidatesList) {
				if ((idxComb & candidates) == candidates)
					continue Loop1;
			}
			candidatesList.add(idxComb);

		}

		System.out.println(candidatesList.size());
//
		return candidatesList.size();
	}

	
}
