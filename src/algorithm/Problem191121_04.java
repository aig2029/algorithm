package algorithm;

public class Problem191121_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static String target;
	static String[] words;
	static int answer;

	public int solution(String begin, String targetInput, String[] wordsInput) {
		answer = Integer.MAX_VALUE;
		target = targetInput;
		words = wordsInput;

		for (int i = 0; i < words.length; i++) {
			int alpNum = 0;

			for (int j = 0; j < begin.length(); j++) {
				if (begin.charAt(j) == words[i].charAt(j))
					alpNum++;
			}

			// 단계 Up
			if (alpNum + 1 == begin.length()) {
				if (words[i].equals(target))
					return 1;
				System.out.println(begin + "에서 " + words[i] + "로");
				boolean[] visited = new boolean[words.length];
				visited[i] = true;

				DFS(words[i], 1, visited);
			}

		}
		if (answer == Integer.MAX_VALUE)
			answer = 0;
		return answer;
	}

	void DFS(String word, int count, boolean[] visited) {

		for (int i = 0; i < words.length; i++) {
			if (!visited[i]) {
				System.out.println();
				System.out.println("현재 카운트 : " + count);
				System.out.println("현재 word : " + word);

				int alpNum = 0;

				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(j) == words[i].charAt(j))
						alpNum++;
				}

				// 단계 Up
				if (alpNum + 1 == word.length()) {
					if (words[i].equals(target) && answer > count + 1) {
						answer = count + 1;
						System.out.println("여기다");
						System.out.println(answer + " " + count + 1);
					}
					System.out.println(word + "에서 " + words[i] + "로");
					visited[i] = true;

					DFS(words[i], count + 1, visited);
				}
				visited[i] = false;

			}

		}

	}

	
}
