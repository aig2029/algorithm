package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Problem191113_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static ArrayList<DividedWord> wordList = new ArrayList<>();

	public String[] solution(String[] files) {

		for (int i = 0; i < files.length; i++) {
			String fileName = files[i];
			// System.out.println(fileName);
			String[] dividedStr = divideFileName(fileName);
			// System.out.println(divide[0]);
			// System.out.println(divide[1]);
			// System.out.println(divide[2]);

			wordList.add(new DividedWord(dividedStr[0], dividedStr[1], dividedStr[2]));

		}

		for (int i = 0; i < wordList.size(); i++) {
			System.out.println(wordList.get(i));
		}

		Collections.sort(wordList, new Comparator<DividedWord>() {
			@Override
			public int compare(DividedWord d1, DividedWord d2) {
				String d1Head = d1.head.toLowerCase();
				String d2Head = d2.head.toLowerCase();

				int d1Number = Integer.parseInt(d1.number);
				int d2Number = Integer.parseInt(d2.number);

				// System.out.println(d1Head+ " " + d2Head +" "+ d1Head.compareTo(d2Head));
				if (d1Head.compareTo(d2Head) < 0)
					return -1;
				else if (d1Head.compareTo(d2Head) == 0) {
					if (d1Number < d2Number)
						return -1;
					else if (d1Number == d2Number)
						return 0;
					else
						return 1;
				} else
					return 1;
			}

		});

		System.out.println();
		String[] answer = new String[wordList.size()];
		for (int i = 0; i < wordList.size(); i++) {
			System.out.println(wordList.get(i));
			DividedWord dw = wordList.get(i);
			answer[i] = dw.head + dw.number + dw.tail;
		}
		return answer;
	}

	class DividedWord {
		String head;
		String number;
		String tail;

		public DividedWord(String head, String number, String tail) {
			this.head = head;
			this.number = number;
			this.tail = tail;
		}

		public String toString() {
			return this.head + "/" + this.number + "/" + this.tail;
		}
	}

	String[] divideFileName(String fileName) {
		String[] str = new String[3];
		int endHeadIndex = 0;
		int startNumIndex = 0;
		int endNumIndex = 0;
		for (int j = 0; j < fileName.length(); j++) {
			char ch = fileName.charAt(j);
			if (ch >= '0' && ch <= '9') {
				endHeadIndex = j - 1;
				startNumIndex = j;

				while (true) {
					j++;
					ch = fileName.charAt(j);
					if (j >= fileName.length()) {
						endNumIndex = fileName.length();
						break;
					}
					if (ch >= '0' && ch <= '9') {
						continue;
					} else {
						endNumIndex = j;
						break;
					}
				}

			}
		}
		str[0] = fileName.substring(0, endHeadIndex + 1);
		str[1] = fileName.substring(startNumIndex, endNumIndex);
		str[2] = (endNumIndex >= fileName.length()) ? null : fileName.substring(endNumIndex, fileName.length());
		return str;
	}

	
}
