package algorithm;

public class Problem191121_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// StringBuilder 안쓰고 테케4번틀림
	static String str;
	static boolean[] visited;
	static String[][] tickets;
	static String attachedAnswer;

	public String[] solution(String[][] ticketsInput) {

		attachedAnswer = "";

		tickets = ticketsInput;

		visited = new boolean[tickets.length];

		for (int i = 0; i < tickets.length; i++) {
			visited[i] = true;
			str = tickets[i][0] + tickets[i][1];

			DFS(tickets[i][1], 1);

			visited[i] = false;
		}

		String[] answer = new String[tickets.length + 1];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = attachedAnswer.substring(0 + 3 * i, 3 + 3 * i);
		}

		return answer;
	}

	void DFS(String prevDep, int count) {

		// System.out.println(count);
		// System.out.println(str);

		if (count == tickets.length) {
			// System.out.println("와우 끝낫습니다.");
			if (attachedAnswer.equals(""))
				attachedAnswer = str;
			else {
				// System.out.println();
				// System.out.println(attachedAnswer);
				// System.out.println(str);
				// System.out.println(attachedAnswer.compareTo(str));
				// System.out.println(str.compareTo(attachedAnswer));
				if (str.compareTo(attachedAnswer) < 0)
					attachedAnswer = str;

				// System.out.println();

			}
			return;
		}

		for (int i = 0; i < tickets.length; i++) {
			if (!visited[i] && prevDep.equals(tickets[i][0])) {
				visited[i] = true;
				str += tickets[i][1];

				DFS(tickets[i][1], count + 1);

				visited[i] = false;
				str = str.substring(0, str.length() - 3);
			}
		}
	}

	
}
