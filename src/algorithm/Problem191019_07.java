package algorithm;

public class Problem191019_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        while(n!=0){
            answer+=(n%10);
            n/=10;
        }

        return answer;
    }
	
}
