package algorithm;

public class Problem191121_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	// StringBuilder로 해결 
	// 테케4 틀린 이유는 속도가 문제가 아니라 ICN으로 출발시켜야햇음
	static StringBuilder sb;
	static boolean[] visited;
	static String[][] tickets;
	static String attachedAnswer;

	public String[] solution(String[][] ticketsInput) {

		attachedAnswer = "";

		tickets = ticketsInput;

		visited = new boolean[tickets.length];

		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i][0].equals("ICN")) {
				visited[i] = true;
				sb = new StringBuilder();
				sb.append(tickets[i][0]).append(tickets[i][1]);
				// str=tickets[i][0]+tickets[i][1];

				DFS(tickets[i][1], 1);

				visited[i] = false;
			}
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
				attachedAnswer = sb.toString();
			else {
				// System.out.println();
				// System.out.println(attachedAnswer);
				// System.out.println(str);
				// System.out.println(attachedAnswer.compareTo(str));
				// System.out.println(str.compareTo(attachedAnswer));
				if (sb.toString().compareTo(attachedAnswer) < 0)
					attachedAnswer = sb.toString();

				// System.out.println();

			}
			return;
		}

		for (int i = 0; i < tickets.length; i++) {
			if (!visited[i] && prevDep.equals(tickets[i][0])) {
				visited[i] = true;

				sb.append(tickets[i][1]);
				// str+=tickets[i][1];

				DFS(tickets[i][1], count + 1);

				visited[i] = false;

				// str=str.substring(0,str.length()-3);
				sb.delete(sb.length() - 3, sb.length());
			}
		}
	}
	
}
