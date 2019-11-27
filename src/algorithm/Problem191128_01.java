package algorithm;

import java.util.ArrayList;

public class Problem191128_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution1(int n, long k) {
		int[] answer = new int[n];

		if (n == 1) {
			answer[0] = 1;
			return answer;
		}

		k--;
		long unit = 1;
		for (long i = n - 1; i >= 1; i--) {
			unit *= i;
		}

		ArrayList<Integer> arrList = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			arrList.add(i);
		}

		long mod = n - 1;
		int level = 0;
		Loop1: while (true) {
			// if(k==0) {
			//     int personNum=1;
			//     while(true){
			//         answer[level++]=personNum;
			//         personNum++;
			//         if(level==n) break Loop1; 
			//     }
			// }

			// System.out.println(k);
			// System.out.println(unit);
			// System.out.println();

			int index = (int) (k / unit);
			answer[level++] = arrList.remove(index);

			if (arrList.size() == 0)
				break;

			k %= unit;
			unit /= mod--;

		}

		return answer;
	}
	
	
	// 버린 코드
	public int[] solution(int n, long k) {
		int[] answer = new int[n];

		long unit = 1;
		int level = 0;
		int personNum = 1;

		for (int i = n; i >= 1; i--) {
			unit *= i;
		}
		if (unit == 1) {
			answer[0] = 1;
			return answer;
		}

		unit /= n--;
		System.out.println(unit);

		int i = 4;
		while (i-- > 0) {

			System.out.println("unit의 값 " + unit);
			System.out.println("k값 : " + k);
			System.out.println("personNum값 : " + personNum);
			System.out.println("level값 : " + level);
			System.out.println("answer[level] : " + answer[0]);
			System.out.println();

			if (k > unit) {
				k -= unit; // k가 0인 순간을 찾으면됨..
				personNum++;
			} else if (k <= unit) {
				unit /= n--;
				answer[level++] = personNum;
				personNum = 1;
			}

		}

		return answer;
	}

	
}
