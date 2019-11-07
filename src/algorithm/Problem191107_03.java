package algorithm;

public class Problem191107_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
        int st=0;
        
        // for(int i=0;i<s.length();i++){
        //     System.out.print(s.substring(i,i+1));
        // }
        
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("(")) st++;
            else if(s.substring(i,i+1).equals(")")) {
                if(st==0) return false;
                else st--;
            }
        }
        
        if(st==0) return true;
        else return false;
        
    }

	
}
