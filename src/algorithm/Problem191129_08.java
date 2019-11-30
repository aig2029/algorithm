package algorithm;

import java.util.Arrays;
import java.util.HashSet;

public class Problem191129_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("123456".indexOf("123"));
		System.out.println("123456".indexOf("456"));
		System.out.println("123456".indexOf("457"));
		
//		new Comparator<T>() {
//
//			@Override
//			public int compare(T o1, T o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
//		Arrays.sort();
//		
		HashSet<String> hs = new HashSet<>();
		
	}
	
	// 문제에서 요구하는 Hash를 활용하여 만든 케이스
	public boolean solution2(String[] phone_book) {
		boolean answer = true;
		HashSet<String> hs = new HashSet<>();

		Arrays.sort(phone_book, (a, b) -> Integer.compare(a.length(), b.length()));

		for (String pb : phone_book) {
			// System.out.println(pb);
			hs.add(pb);
		}

		for (String pb : phone_book) {
			hs.remove(pb);
			for (String hsString : hs) {
				if (hsString.indexOf(pb) == 0)
					return false;
			}
		}

		return answer;
	}
	
	// 접두어라는 문제의 조건을 간과햇다..
	// startsWith라는 메소드를 잊고 있었다..
	public boolean solution1(String[] phone_book) {
		boolean answer = true;
		HashSet<String> hs = new HashSet<>();

		Arrays.sort(phone_book, (a, b) -> Integer.compare(a.length(), b.length()));

		int leng = phone_book.length;
		for (int i = 0; i < leng; i++) {
			for (int j = i + 1; j < leng; j++) {
				if (phone_book[j].startsWith(phone_book[i]))
					return false;
			}
		}

		return answer;
	}
	
	// 테케2개 틀리고 시간 초과 2개
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		HashSet<String> hs = new HashSet<>();

		Arrays.sort(phone_book, (a, b) -> Integer.compare(b.length(), a.length()));

		for (String pb : phone_book) {
			// System.out.println(pb);

			for (String s : hs) {
				// System.out.print(s+" ");
				if (s.indexOf(pb) != -1) {
					// System.out.println("지금 이순간");
					return false;
				}
			}
			// System.out.println();

			hs.add(pb);

		}

		return answer;
	}

	
}
