package algorithm;

import java.util.Stack;

public class Problem191107_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n) {
	      int answer = n;
	      
	      int nBit = Integer.bitCount(n);
	      System.out.println(nBit);
	      
	      while(true){
	          answer++;
	          
	          if( Integer.bitCount(answer) == nBit ) break;
	      }
	      
	      
	      return answer;
	      
	      
	  }
	
	
	// 이 밑에가 bitcount()메소드모르고 혼자 지지고볶은거임
	public int solution1(int n) {
	      int answer = 0;
	      
	      
	      System.out.println(nextBinary(binary(56)));
	      
	      
	      return answer;
	  }
	    static String nextBinary(long n){
	        String str = Long.toString(n);
	        String nStr = "";
	        System.out.println(str);
	        
	        int i=str.length()-1;
	        Loop1: while(true){
	            if(str.charAt(i)=='1'){
	                if(i==0) {
	                    nStr="10"+nStr;
	                    break;
	                }
	                nStr+="1";
	                i--;
	                continue;
	            }
	            else if(str.charAt(i)=='0'){
	                if(i!=str.length()-1){
	                    nStr=str.substring(0,i)+"10"+nStr.substring(1);
	                    break;
	                }
	                else{ // 시작부터 0인경우
	                    nStr="1";
	                    i--;
	                
	                    while(true){
	                        if(str.charAt(i)=='0'){
	                            nStr=str.substring(0,i)+"10"+nStr.substring(1);
	                            break Loop1;
	                        }
	                        else{
	                            if(i==0) {
	                                nStr="10"+nStr;
	                                break Loop1;
	                            }
	                            nStr="0"+nStr;
	                        }
	                    }
	                }              
	            }
	        }
	        return nStr;
	    }
	    
	    static long binary(int n){
	        Stack<Integer> st = new Stack<>();
	        int res = 0;
	        
	        while(true){
	            st.push(n%2);
	            n/=2;
	            if(n<2){
	                st.push(n);
	                break;
	            }
	        }
	        while(st.size()!=0){
	            res*=10;
	            res+=st.pop();
	        }
	        // System.out.println(res);
	        return res;
	    }

	
}
