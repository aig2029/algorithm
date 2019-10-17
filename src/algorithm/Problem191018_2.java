package algorithm;

import java.util.ArrayList;

public class Problem191018_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int []arr) {
        int[] answer;
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
//			if(!arrList.contains(arr[i])) {
//				arrList.add(arr[i]);
//			}
        	if(arrList.size()==0) {
        		arrList.add(arr[i]);
        	}
        	else if(arrList.get(arrList.size()-1)!=arr[i]) {
				arrList.add(arr[i]);
			}
		}
        
        System.out.println(arrList);
        
        answer=new int[arrList.size()];
        
        for (int i = 0; i < arrList.size(); i++) {
			answer[i]=arrList.get(i);
		}
        
        return answer;
	}

}
