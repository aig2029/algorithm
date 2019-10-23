package algorithm;

public class Problem191023_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];

		for (int i = heights.length - 1; 0 <= i; i--) {
			for (int j = i - 1; 0 <= j; j--) {
				if (heights[i] < heights[j]) {
					answer[i] = j + 1;
					break;
				}
			}
		}
		return answer;
	}
	
}
