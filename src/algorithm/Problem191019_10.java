package algorithm;

public class Problem191019_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int[] arr) {
		if (arr.length == 1)
			return new int[] { -1 };

		int[] answer = new int[arr.length - 1];

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min)
				continue;
			else
				answer[j++] = arr[i];
		}

		return answer;
	}
	
}
