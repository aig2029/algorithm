package algorithm;

public class Problem191210_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
        int leng = A.length+1;
        int sum=0;
        if(leng%2==0) sum=(leng+1)*(leng/2);
        if(leng%2==1) sum=((leng+1)/2)*(leng);
        
        for(int a : A){
            sum-=a;
        }
        
        return sum;
    }
	
}
