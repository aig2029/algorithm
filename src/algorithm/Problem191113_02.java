package algorithm;

import java.util.ArrayList;

public class Problem191113_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static ArrayList<Word> dictionary = new ArrayList<>();
	static ArrayList<Integer> finIndex = new ArrayList<>();
	static String msg;
	static boolean isEnded;

	public int[] solution(String inputMsg) {

		msg = inputMsg;
		isEnded = false;

		initDictionary();

		while (!isEnded) {
			findWordWithDictionary();

		}

		int[] answer = new int[finIndex.size()];
		for (int i = 0; i < finIndex.size(); i++) {
			answer[i] = finIndex.get(i);
			// System.out.println(answer[i]);
		}

		return answer;
	}

	void findWordWithDictionary() {

		// System.out.println(msg);

		for (int i = dictionary.size() - 1; i >= 0; i--) {
			Word nowWord = dictionary.get(i);
			String dicWord = nowWord.word;
			// System.out.println(dicWord);
			if (msg.indexOf(dicWord) == 0) {
				// System.out.println("발견햇습니다."+dicWord);
				if (dicWord.length() + 1 <= msg.length()) {
					dictionary.add(new Word(dictionary.size() + 1, msg.substring(0, dicWord.length() + 1)));
					msg = msg.substring(dicWord.length(), msg.length());
					// System.out.println("남은 메시지:"+msg);             
				}
				if (dicWord.equals(msg)) {
					// System.out.println("마지막 메시지입니다.");
					isEnded = true;
				}
				finIndex.add(nowWord.index);
				return;
			}
		}
	}

	class Word {
		int index;
		String word;

		Word(int index, String word) {
			this.index = index;
			this.word = word;
		}
	}

	void initDictionary() {

		dictionary.add(new Word(1, "A"));
		dictionary.add(new Word(2, "B"));
		dictionary.add(new Word(3, "C"));
		dictionary.add(new Word(4, "D"));
		dictionary.add(new Word(5, "E"));
		dictionary.add(new Word(6, "F"));
		dictionary.add(new Word(7, "G"));
		dictionary.add(new Word(8, "H"));
		dictionary.add(new Word(9, "I"));
		dictionary.add(new Word(10, "J"));
		dictionary.add(new Word(11, "K"));
		dictionary.add(new Word(12, "L"));
		dictionary.add(new Word(13, "M"));
		dictionary.add(new Word(14, "N"));
		dictionary.add(new Word(15, "O"));
		dictionary.add(new Word(16, "P"));
		dictionary.add(new Word(17, "Q"));
		dictionary.add(new Word(18, "R"));
		dictionary.add(new Word(19, "S"));
		dictionary.add(new Word(20, "T"));
		dictionary.add(new Word(21, "U"));
		dictionary.add(new Word(22, "V"));
		dictionary.add(new Word(23, "W"));
		dictionary.add(new Word(24, "X"));
		dictionary.add(new Word(25, "Y"));
		dictionary.add(new Word(26, "Z"));
		// System.out.println(dictionary.size());
	}

	
}
