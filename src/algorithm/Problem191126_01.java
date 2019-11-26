package algorithm;

public class Problem191126_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	//
	public int solution(String s)
    {
        int answer = 0;

        // System.out.println(s);
        
        // char[] ch = new char[s.length()];
        // for(int i=0; i<s.length(); i++){
        //     ch[s.length()-1-i]=s.charAt(i);
        // }
       
        // String reverseS = String.valueOf(ch);
        
        // System.out.println(reverseS);
    
        for(int i=0; i<s.length(); i++){
            Loop2: for(int j=s.length(); j>=i+1; j--){
                String tempStr = s.substring(i,j);
                // System.out.println(tempStr);
                 
                for(int k=0; k<tempStr.length()/2; k++){
                    // char a = s.charAt(i+k);
                    // char b = s.charAt(j);
                    
                    if(tempStr.charAt(k)!=tempStr.charAt(tempStr.length()-1-k)) continue Loop2;
                    
                    // System.out.println("==============");
                    // System.out.println(tempStr.charAt(k));
                    // System.out.println(tempStr.charAt(tempStr.length()-1-k));
                    // System.out.println("==============");
                    // if(tempStr.charAt(k)!=tempStr.charAt(tempStr.length()-k)) continue Loop2;
                }
                
                if(answer<tempStr.length()) {
                    answer=tempStr.length();
                    break;
                }
                
                // System.out.println("tempStr의 startIndex : "+(s.length()-1-i));
                // System.out.println(s.indexOf(tempStr));
                
                
            }
        }
        
        
        return answer;
    }

	
}
