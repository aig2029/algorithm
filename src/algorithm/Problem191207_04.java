package algorithm;

import java.util.ArrayList;

public class Problem191207_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static final int STUDENT_NUM = 3;
	static int[] student1_guessPattern = { 1, 2, 3, 4, 5 };
	static int[] student2_guessPattern = { 2, 1, 2, 3, 2, 4, 2, 5 };
	static int[] student3_guessPattern = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

	public int[] solution2(int[] answers) {
		int[] score = getScore(answers);
		int topScore = getTopScore(score);

		ArrayList<Integer> fistRankList = getfirstRankList(score, topScore);

		int[] answer = converIntegers(fistRankList);
		return answer;
	}

	public int[] converIntegers(ArrayList<Integer> arrayList) {
		int[] array = new int[arrayList.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = arrayList.get(i);
		}
		return array;
	}

	public ArrayList<Integer> getfirstRankList(int[] score, int topScore) {
		ArrayList<Integer> firstRankList = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			if (topScore == score[i])
				firstRankList.add(i + 1);
		}

		return firstRankList;
	}

	public int getTopScore(int[] score) {
		int topScore = 0;
		for (int i = 0; i < score.length; i++) {
			topScore = Math.max(score[i], topScore);
		}
		return topScore;
	}

	public int[] getScore(int[] answers) {
		int[] score = new int[STUDENT_NUM];
		for (int problemNum = 0; problemNum < answers.length; problemNum++) {
			if (student1_guessPattern[problemNum % student1_guessPattern.length] == answers[problemNum])
				score[0]++;
			if (student2_guessPattern[problemNum % student2_guessPattern.length] == answers[problemNum])
				score[1]++;
			if (student3_guessPattern[problemNum % student3_guessPattern.length] == answers[problemNum])
				score[2]++;
		}
		return score;
	}
	
	////// 함수화 안하고 푼 것..
	public int[] solution(int[] answers) {

		int[] supo1 = { 1, 2, 3, 4, 5 };              // 5개
		int[] supo2 = { 2, 1, 2, 3, 2, 4, 2, 5 };        // 8개
		int[] supo3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };    // 10개

		int[] score = new int[4];

		for (int i = 0; i < answers.length; i++) {
			int currentAnswer = answers[i];
			if (supo1[i % 5] == currentAnswer)
				score[1]++;
			if (supo2[i % 8] == currentAnswer)
				score[2]++;
			if (supo3[i % 10] == currentAnswer)
				score[3]++;
		}

		final int TOP_SCORE = Math.max(score[1], Math.max(score[2], score[3]));

		ArrayList<Integer> rankArray = new ArrayList<>();
		if (score[1] == TOP_SCORE)
			rankArray.add(1);
		if (score[2] == TOP_SCORE)
			rankArray.add(2);
		if (score[3] == TOP_SCORE)
			rankArray.add(3);

		int[] answer = arrayListToArray(rankArray);

		return answer;
	}

	int[] arrayListToArray(ArrayList<Integer> arrayList) {
		int[] array = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			array[i] = arrayList.get(i);
		}
		return array;
	}

	
}
