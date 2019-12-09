package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Problem191207_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] A) {
		// write your code in Java SE 8

		// for(int i : A){
		//     System.out.println(i);
		// }

		ArrayList<indexAndValue> arr = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			arr.add(new indexAndValue(i, A[i]));
		}

		Collections.sort(arr);
		// System.out.println();
		// System.out.println(arr.size());

		int pre = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (i % 2 == 0)
				pre = arr.get(i).value;
			if (i % 2 == 1) {
				if (pre != arr.get(i).value)
					break;
			}
			// System.out.println(arr.get(i).value);
			if (i == arr.size() - 1)
				pre = arr.get(i).value;
		}

		return pre;

	}

	class indexAndValue implements Comparable<indexAndValue> {
		int index;
		int value;

		indexAndValue(int index, int value) {
			this.index = index;
			this.value = value;
		}

		@Override
		public int compareTo(indexAndValue iav) {
			return Integer.compare(this.value, iav.value);
		}
	}

	
}
