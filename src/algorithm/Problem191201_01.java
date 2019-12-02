package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Problem191201_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("나는 준일하다.");
//		PriortiyQueue<Integer>
		
//		StackQueue sq = new StackQueue();
		
//		sq.offer(1);
		
	}
	
	public int[] solution(String[] genres, int[] plays) {
		int[] answer;
		ArrayList<Integer> answerList = new ArrayList<>();

		HashMap<String, Genre> hm = new HashMap<>();

		for (int i = 0; i < plays.length; i++) {
			// System.out.println(i+" "+genres[i]+" "+plays[i]);
			if (!hm.containsKey(genres[i])) {
				hm.put(genres[i], new Genre(genres[i]));
			}

			Genre nowGenre = hm.get(genres[i]);
			nowGenre.addSong(i, plays[i]);

			hm.put(genres[i], nowGenre);
		}

		PriorityQueue<Genre> pq = new PriorityQueue<>();
		// System.out.println();
		for (String key : hm.keySet()) {
			// System.out.println(hm.get(key));
			pq.add(hm.get(key));
		}

		// System.out.println();
		while (!pq.isEmpty()) {
			Genre nowGenre = pq.poll();
			// System.out.println(nowGenre);

			if (nowGenre.mostPlayedIndex[0] != -1)
				answerList.add(nowGenre.mostPlayedIndex[0]);
			if (nowGenre.mostPlayedIndex[1] != -1)
				answerList.add(nowGenre.mostPlayedIndex[1]);

		}

		// System.out.println(answerList.size());

		answer = new int[answerList.size()];
		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}

		// pq사용해서 총 playtime긴 순서대로의 장르를 먼저 빼옴..

		return answer;
	}

	class Genre implements Comparable<Genre> {
		String genre;
		int[] mostPlayedIndex;
		int[] mostPlayedTime;
		int totalPlayTime;

		Genre(String genre) {
			this.genre = genre;
			mostPlayedIndex = new int[2];
			mostPlayedTime = new int[2];
			Arrays.fill(mostPlayedIndex, -1);
			Arrays.fill(mostPlayedTime, -100);
			totalPlayTime = 0;
		}

		void addSong(int idx, int playTime) {
			totalPlayTime += playTime;

			if (playTime > mostPlayedTime[0]) {
				mostPlayedTime[1] = mostPlayedTime[0];
				mostPlayedTime[0] = playTime;

				mostPlayedIndex[1] = mostPlayedIndex[0];
				mostPlayedIndex[0] = idx;

			} else if (playTime > mostPlayedTime[1]) {
				mostPlayedTime[1] = playTime;
				mostPlayedIndex[1] = idx;
			}

		}

		public String toString() {
			return genre + " " + mostPlayedIndex[0] + " " + mostPlayedIndex[1] + " " + totalPlayTime;
		}

		@Override
		public int compareTo(Genre g) {
			return Integer.compare(g.totalPlayTime, this.totalPlayTime);
		}

	}
	
	
	
//	static class StackQueue {
//		Stack<Integer> st1;
//		Stack<Integer> st2;
//		
//		public StackQueue() {
//			// TODO Auto-generated constructor stub
//			st1 = new Stack<>();
//			st2 = new Stack<>();
//		}
//		
//		void offer(int input) {
//			st1.add(input);
//		}
//		int peek() {
//			if(st2.isEmpty()) {
//				if(st1.isEmpty()) {
//					System.out.println("Empty.. can't peek");
//					return -1;
//				}
//				else {
//					while(!st1.isEmpty()) {
//						st2.add(st1.pop());
//					}
//					
//				}
//			}
//			return st2.peek();
//		}
//	}

	
}
