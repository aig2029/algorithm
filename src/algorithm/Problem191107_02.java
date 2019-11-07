package algorithm;

public class Problem191107_02 {

	public static void main(String[] args) {
//		permutation("abcd");
	}

	static int answer;
	static String[] sData;

	public int solution(int n, String[] data) {
		answer = 0;
		sData = data;
		String str = "ACFJMNRT";
		// String str = "NFRT";

		// for(int i=0; i<data.length; i++){
		//     System.out.println(data[i]);
		//     System.out.println(data[i].charAt(0));
		//     System.out.println(data[i].charAt(2));
		//     System.out.println(data[i].charAt(3));
		//     System.out.println(data[i].charAt(4));
		//     
		// }

		permutation(str);

		return answer;
	}

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {

			boolean isConditioned = true;
			for (int j = 0; j < sData.length; j++) {
				String sd = sData[j];
				// System.out.println(sd);

				int a = 0, b = 0;
				int c = sd.charAt(4) - 48 + 1;

				for (int i = 0; i < prefix.length(); i++) {
					// System.out.print(prefix.charAt(i));
					if (sd.charAt(0) == prefix.charAt(i))
						a = i;
					if (sd.charAt(2) == prefix.charAt(i))
						b = i;
				}
				// System.out.println();
				// System.out.println(c);
				// System.out.println(a+" "+b);
				// System.out.println(sd.charAt(0)+" "+sd.charAt(2));

				if (sd.charAt(3) == '<' && Math.abs(a - b) >= c) {
					// System.out.println("조건 "+(j+1)+"불만족");
					isConditioned = false;
					break;
				} else if (sd.charAt(3) == '>' && Math.abs(a - b) <= c) {
					// System.out.println("조건 "+(j+1)+"불만족");
					isConditioned = false;
					break;
				} else if (sd.charAt(3) == '=' && Math.abs(a - b) != c) {
					// System.out.println("조건 "+(j+1)+"불만족");
					isConditioned = false;
					break;
				}

				// System.out.println();
			}
			if (isConditioned)
				answer++;

			// System.out.println();
			// System.out.println(prefix);

		}

		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}
	


}
