package algorithm;

public class Problem191019_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(String s, int n) {
		char[] units = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			char unit = s.charAt(i);
			if (!(unit == ' ')) {

				if ((unit >= 'a' && unit <= 'z')) {
					unit += n; // 이동
					if (unit > 'z')
						unit -= 26;
				}

				else if ((unit >= 'A' && unit <= 'Z')) {
					unit += n; // 이동
					if (unit > 'Z')
						unit -= 26;
				}

				// if( !( (unit>='a' && unit<='z') || (unit>='A' && unit<='Z')) ){
				//     unit-=26;
				// }
				System.out.println((char) (unit));

				// System.out.println((int)'Z');
				// System.out.println((int)'z');
			}

			units[i] = unit;
		}
		;

		return String.valueOf(units);
	}
	
}
