package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Problem191107_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int []A, int []B)
    {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        
        for(int i=0; i<A.length; i++){
            arrA.add(A[i]);
            arrB.add(B[i]);
        }
        Collections.sort(arrA);
        Collections.sort(arrB);
        Collections.reverse(arrB);
        
        for(int i=0; i<A.length; i++){
            answer+=arrA.get(i) * arrB.get(i);
            // System.out.println(arrA.get(i));
            // System.out.println(arrB.get(i));
        }
        
        
        return answer;
    }
	
	

	
}
