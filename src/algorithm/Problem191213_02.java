package algorithm;

public class Problem191213_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        // 첫번째 인자 찾는것
        // B-A를 K로 나눈 몫을 더하는 것
        
        int first = (A/K)*K;
        int unit = 0;
        int temp = 0;
        
        while(temp<=B){
            temp = first + K*unit;
            if( A<=temp && temp<=B ) {
                first = temp;
                break;
            }
            else unit++;
        }
        if(temp>B) return 0;
        
        return (B-first)/K+1;
        
    }
	
}
