package algorithm;

public class Problem191019_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public long solution(long n) {
	      long answer = 0;
	      double sqrt = Math.sqrt(n);
	      long long_sqrt = (long)sqrt;
	      if(sqrt-long_sqrt==0){
	        return (long)Math.pow(long_sqrt+1,2);
	      }
	      else return -1;
	      
	  }

}
