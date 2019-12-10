package algorithm;

public class Problem191210_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	//
	public int solution(int X, int[] A) {
		// write your code in Java SE 8

		boolean[] canJump = new boolean[X + 1];

		int pre = 0;
		int index = 0;
		for (; index < A.length; index++) {
			canJump[A[index]] = true;
			if (A[index] == pre + 1) {
				pre++;
				while (pre < X) {
					if (canJump[pre + 1])
						pre++;
					else
						break;
				}
			}
			if (pre == X)
				break;
		}
		if (pre == X)
			return index;
		else
			return -1;

	}

	
}
