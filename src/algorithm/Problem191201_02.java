package algorithm;

public class Problem191201_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];

		for (int i = 0; i < heights.length; i++) {
			System.out.print(heights[i] + " ");
		}

		Loop1: for (int i = heights.length - 1; i >= 0; i--) {
			// System.out.print(heights[i]+" ");
			int nowHeight = heights[i];
			for (int j = i - 1; j >= 0; j--) {
				if (heights[j] > nowHeight) {
					answer[i] = j + 1;
					continue Loop1;
				}
			}
		}

		return answer;
	}

	
}
