package algorithm;

public class Problem191129_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cc = solution("zothf".toCharArray(),
				"otz".toCharArray(),"hh".toCharArray());
		
		cc = solution("ab".toCharArray(),
				"ba".toCharArray(),"a".toCharArray());
		
	}
	
	static char[] solution(char[] rule, char[] A, char[] B) {
		
		
		int intA=0;
		int intB=0;
		
		int digit = A.length-1;
		for(int j=0; j<A.length; j++) {
			int unit = (int)Math.pow((double)rule.length, (double)digit);
			digit--;
			
			for(int i=0; i<rule.length; i++) {
				if(A[j]==rule[i]) {
					intA+=unit*i;
				}
			}
		}
		
		digit = B.length-1;
		for(int j=0; j<B.length; j++) {
			int unit = (int)Math.pow((double)rule.length, (double)digit);
			digit--;
			
			for(int i=0; i<rule.length; i++) {
				if(B[j]==rule[i]) {
					intB+=unit*i;
				}
			}
		}
		System.out.println(intA);
		System.out.println(intB);
		
		int intRes = intA-intB;
		System.out.println(intRes);
		System.out.println();
		
		String res = "";
		
		while(true) {
			int mod = intRes/rule.length;
			int rest = intRes%rule.length;
			intRes/=rule.length;
			
			res=Character.toString(rule[rest])+res;
			
			if(mod==0) break;
		}
		System.out.println(res);
		
		char[] resS = new char[0];
		return resS;
	}
//
	
}
