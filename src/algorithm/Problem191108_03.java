package algorithm;

public class Problem191108_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 더 깔끔한코드 이거 아래는 내가 짠 코드
	public String solution1(String s) {
	      String answer = "";
	      
	      String[] split = s.toLowerCase().split("");
	      for(int i=0; i<split.length; i++){
	          System.out.println(split[i]);
	      }
	      
	      boolean flag = true;
	      
	      for(String str : split){
	          answer+= flag?str.toUpperCase():str;
	          flag = str.equals(" ")? true : false; 
	      }
	      
	      return answer;
	      
	      
	  }

	
	public String solution(String s) {
		String answer = "";

		answer = s.toLowerCase();

		boolean isPassedGap = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals(" ")) {
				isPassedGap = true;
				continue;
			} else {
				if (isPassedGap) {
					answer = answer.substring(0, i) + answer.substring(i, i + 1).toUpperCase() + answer.substring(i + 1);
					isPassedGap = false;
				}
			}
		}

		//	       for(int i=0; i<split.length; i++){
		//	           String s1 = split[i].substring(0,1).toUpperCase();
		//	           String s2 = split[i].substring(1).toLowerCase(); 

		//	           // System.out.println(split[i]);
		//	           if(i==split.length-1) answer=answer+(s1+s2);
		//	           else answer=answer+(s1+s2+" ");
		//	       }

		System.out.println(answer);

		return answer;
	}

	
}
