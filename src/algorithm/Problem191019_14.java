package algorithm;

public class Problem191019_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public double solution(int[] arr) {
		double answer = 0;
		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total + "" + arr.length);
		total = total / (double) arr.length;

		return total;
	}
	
}
