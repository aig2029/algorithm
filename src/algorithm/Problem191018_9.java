package algorithm;

public class Problem191018_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(String[] seoul) {
		for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				return "김서방은 "+i+"에 있다";
			}
		}
		return "";
	}

}
