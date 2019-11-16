package algorithm;

public class Problem191116_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 이건 테크닉을 익혀야될거 같음 사칙연산은 어떻게 한다고손쳐도
	// 55 555 이거를 어떻게 표현해야할지 아무리 생각해도 못떠올랏음
	static int answer = -1;
    static int number;
    static int N;
    public int solution(int inputN, int inputNumber) {
        N=inputN;
        number = inputNumber;
        dfs(0,0);
        
        return answer;
        
    }
    
    static void dfs(int count, int prevNum){
        int nowN = N;
        if(count>8) return;
        
        if(prevNum == number ){
            if(answer==-1 || count<answer) answer=count;
        }
        
        for(int i=0; count+i<8 ; i++){
            dfs(count+i+1,prevNum+nowN);
            dfs(count+i+1,prevNum-nowN);
            dfs(count+i+1,prevNum*nowN);
            dfs(count+i+1,prevNum/nowN);
            
            nowN = nowN*10+N;
        }
    }
    
    // 참조한 코드
//	static int answer = -1;
//
//	public int solution(int N, int number) {
//
//		dfs(N, number, 0, 0);
//		return answer;
//	}
//
//	static void dfs(int N, int number, int cnt, int prev) {
//		//N의 카운트를 늘려가며 dfs 로 수행한다. 
//		//그 값을 저장하고 그 값이 number와 동일한지 확인한다. 
//		int temp_N = N;
//		if (cnt > 8) {
//			answer = -1;
//			return;
//		}
//
//		if (number == prev) {
//			if (answer == -1 || answer > cnt)
//				answer = cnt;
//			return;
//		}
//
//		for (int i = 0; i < 8 - cnt; i++) {
//			dfs(N, number, cnt + i + 1, prev - temp_N);
//			dfs(N, number, cnt + i + 1, prev + temp_N);
//			dfs(N, number, cnt + i + 1, prev * temp_N);
//			dfs(N, number, cnt + i + 1, prev / temp_N);
//
//			temp_N = increaseNumber(temp_N, N);
//		}
//	}
//
//	static int increaseNumber(int value, int N) {
//		return value * 10 + N;
//	}


	
}
