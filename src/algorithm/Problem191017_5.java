package algorithm;

public class Problem191017_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] a = {1,2,3,4,5};			 // 5
		int[] b = {2,1,2,3,2,4,2,5};	 // 8
		int[] c = {3,3,1,1,2,2,4,4,5,5}; // 10
		
		int resA=0,resB=0,resC=0;
		
        int leng = answers.length;
        
		for(int i=0; i<leng;i++) {
			
			if(a[i%5]==answers[i%leng]){
                resA++;
            }
            if(b[i%8]==answers[i%leng]){
                resB++;
            }
            if(c[i%10]==answers[i%leng]){
                resC++;
            }
            
		}
        System.out.println(resA + " " + resB+ " "+ resC);
        if(resA==resB && resA==resC) {
        	answer = new int[] {1,2,3};
        }
        else if(resA==resB && resA>resC) {
        	answer = new int[] {1,2};
        }
        
        else if(resB==resC && resA<resB) {
        	answer = new int[] {2,3};
        }
        
        else if(resA==resC && resA>resB) {
        	answer = new int[] {1,3};
        }
        
        else if(resA>resB && resA>resC) {
        	answer = new int[] {1};
        }
        
        else if(resB>resA && resB>resC) {
        	answer = new int[] {2};
        }
        
        else if(resC>resA && resC>resB) {
        	answer = new int[] {3};
        }
        return answer;
    }
	

}
