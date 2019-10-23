package algorithm;

public class Problem191024_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String name) {
		int answer = 0;

		char[] chr = name.toCharArray();

		int leftAndRight = name.length();

		for (int i = 0; i < chr.length; i++) {
			if (chr[i] != 'A') {
				int a = (int) (chr[i] - 'A');
				int b = 26 - (int) (chr[i] - 'A');
				int upAndDown = (a > b) ? b : a;
				answer += upAndDown;
			}

			// 이 부분 개중요함 Left And Right를 찾는 공식
			// AAA..AAA N AAA...AAA K AAA..AAA
			// ㅡ a개의 Aㅡ				    ㅡ b개의 Aㅡ 
			
			// 결국 앞으로 가든 뒤로 가든 지지든 볶든 결국은 
			// 가장 명확한 짧은 길은 정해져 있음 어떻게든 그 값을 찾는
			// 공식을 만들어서 풀어줘야함 일일히 시뮬레이션 하면
			// ㄹㅇ쓰레기코드임
			// K먼저 가든 N으로 먼저 가든 생각할 것이 아닌.
			// 맨처음 index 0부터 시작했을 때 결국 N과 K는 반드시
			// 들러줘야 한다는 것을 생각해서 a + b 를 해주고
			// a와 b중 더 작은 값을 더해주면 그게 최단경로임
			// a가 더 작으면 N먼저 들릴 것이고 b가 더 작으면 k먼저 들릴 것임
			
			int next = i + 1;
			while (next < chr.length && chr[next] == 'A')
				next++;
			leftAndRight = Math.min(leftAndRight, i + (chr.length - next) + Math.min(i, chr.length - next));

		}

		answer += leftAndRight;

		return answer;
	}
	
}
