package algorithm;

public class Problem191103_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int brown, int red) {
		int[] answer = new int[2];

		int sero = 1;
		while (sero <= red) {
			if (red % sero == 0) {
				int garo = red / sero;
				int brick = 2 * (garo + sero) + 4;
				if (brick == brown) {
					// System.out.println("브릭브라운");
					answer[0] = garo + 2;
					answer[1] = sero + 2;
					break;
				}
			}
			sero++;
		}

		return answer;
	}

	
}
