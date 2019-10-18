package algorithm;

public class Problem191018_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	boolean solution(String s) {
		boolean answer = true;
		
		s=s.toLowerCase();
		int p=0, y=0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='p') p++;
			else if(s.charAt(i)=='y') y++;
		}
		
		if((p==0 && y==0)|| p==y) return true;
		else if(p!=y) return false;
		
		return true;
	}

}
