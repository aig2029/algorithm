package algorithm;

import java.util.ArrayList;

public class Problem191023_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(String number, int k) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i=0; i<number.length(); i++){
            arrList.add((int)number.charAt(i)-48);
            // System.out.print(arrList.get(i));
        }
        
        // System.out.println();
       
        int i=1;
        while(k>0){
            if(i-1>=0 && arrList.get(i)>arrList.get(i-1)){
                arrList.remove(i-1);
                i--;
                k--;
                
//                 System.out.println(arrList.size());
//         for(int j=0; j<arrList.size(); j++){
            
//             System.out.print(arrList.get(j));
//         }
//                 System.out.println();
                
            }
            else {
                i++;
                if(i>=arrList.size()) break;
            }
        }
        
        
        String answer = "";
        
        // System.out.println();
        // System.out.println(arrList.size());
        for(int j=0; j<arrList.size()-k; j++){
            // System.out.print(arrList.get(j));
            answer+=Integer.toString(arrList.get(j));
        }

        return answer;
    }
	
	
	// 위에건 시간초과 때문에 안됨 아마 arraylist & 정수끼리 비교여서 그런듯.. char끼리 비교로 바꿔야함
//	public String solution(String number, int k) {
//        char[] res = new char[number.length()-k];
//        Stack<Character> st = new Stack<>();
//        
//        for(int i=0; i<number.length();i++){
//            char c = number.charAt(i);
//            while(!st.isEmpty() && st.peek()<c && k-->0) st.pop();
//            st.push(c);
//        }
//        
//        for(int i=0; i<res.length; i++){
//            res[i] = st.get(i);
//        }
//
//        return new String(res);
//    }
	
}
