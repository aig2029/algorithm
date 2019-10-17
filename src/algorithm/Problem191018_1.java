package algorithm;

public class Problem191018_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(int a, int b) {
	      String answer = "";
	      // 1/1 = fri = 1/8 = 1/15
	      // 31 29 31 30 31 30 31 31 30 31 30 31
	      int[] days= {31,29,31,30,31,30,31,31,30,31,30,31};
	      String[] day = {"THU","FRI","SAT","SUN","MON", "TUE","WED"};
	      int num=b;
	      
	      for (int i = 1; i < a; i++) {
			num+=days[i-1];
	      }
	      // 1 fri = 8 fri
	      num%=7;
	      answer=day[num];
	      return answer;
	  }

}
