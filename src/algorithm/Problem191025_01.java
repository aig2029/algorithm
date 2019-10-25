package algorithm;

public class Problem191025_01 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";
		String p ="()))((()";
        
		answer = uvAlgorithm(p);
        
        
        System.out.println();
        System.out.println(answer);
        
        
        // 입출력 예제 1번 전부 올바른 경우 따로 예외처리 
	}
	
	
    
    
    public static String uvAlgorithm(String input){
        if(input.equals("")) return "";
    	
    	
    	String returnString="";
    	int left=0;
        int right=0;
        boolean isMatched = true;
        
        
        int i=0;
        // uv분류 알고리즘
        while(true){
            if(input.charAt(i)=='(') {
                left++;
            }
            else if(input.charAt(i)==')') {
                right++;
            }
            if(right>left) isMatched = false;
            
            if(left==right) {
                System.out.println(left);
                System.out.println(right);
                break;
            }
            i++;
        }
        // u
        String u = input.substring(0,i+1);
        System.out.print(u);
        
        
        System.out.print(" ");
        // v
        String v = input.substring(i+1,input.length());
        System.out.print(v);
        System.out.print(v.length());
        
        if(isMatched) {
        	returnString+=u;
            System.out.println("올바른 u입니다. 밑에 answer출력");
            returnString+=uvAlgorithm(v);
        }
        else {
        	String voidString ="";
        	voidString+="(";
        	voidString+=uvAlgorithm(v);
        	voidString+=")";
        	voidString+=for4_4(u);
        	returnString+=voidString;
        }
        
        return returnString;
    }
    	
    static String for4_4 (String input) {
    	String inputSub = input.substring(1, input.length()-1);
    	String returnString4_4 = "";
    	
    	for(int i=0; i<inputSub.length(); i++) {
    		if(inputSub.charAt(i)=='(') {
    			returnString4_4+=")";
    		}
    		else if(inputSub.charAt(i)==')') {
    			returnString4_4+="(";
    		}
    	}
   	
    	return returnString4_4;
    }

	
}
