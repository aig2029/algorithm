package algorithm;

public class Problem191116_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		System.out.println(arr1[0]);

		for (int i = 0; i < n; i++) {

			String arr1Str = Integer.toBinaryString(arr1[i]);
			String arr2Str = Integer.toBinaryString(arr2[i]);
			int or = arr1[i] | arr2[i];

			//	           System.out.println(arr1Str);
			//	           System.out.println(arr2Str);

			String orStr = Integer.toBinaryString(or);
			while (orStr.length() < n) {
				orStr = "0" + orStr;
			}

			// System.out.println(orStr);
			answer[i] = orStr.replaceAll("1", "#").replaceAll("0", " ");
			System.out.println();

		}

		// for(int i=0; i<n; i++){
		//   System.out.println(answer[i]);
		// }

		return answer;
	}

	
}
