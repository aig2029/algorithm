package algorithm;

public class Problem191019_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(String phone_number) {
		char[] chr = phone_number.toCharArray();

		for (int i = 0; i < phone_number.length() - 4; i++) {
			chr[i] = '*';
		}

		return String.valueOf(chr);
	}
	
}
