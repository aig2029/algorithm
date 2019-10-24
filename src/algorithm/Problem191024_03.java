package algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Problem191024_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(int[] numbers) {
        String answer = "";
        String[] numbersString = new String[numbers.length];
        
        for(int i=0; i<numbersString.length; i++){
            numbersString[i] = Integer.toString(numbers[i]);
            System.out.println(numbersString[i]);
        }  
        
        Arrays.sort(numbersString, new Comparator<String>(){
            public int compare(String s1, String s2){
                int res;
                int i=0;
                char s1ors2FinChar;
                
                while(true){
                    if(s1.charAt(i)==s2.charAt(i)){
                        i++;
                        if(s1.length()-1<=i) {
                            s1ors2FinChar = s2.charAt(i-1);
                            break;
                        }
                        else if(s2.length()-1<=i){
                            s1ors2FinChar = s1.charAt(i-1);
                            break;
                        }
                    }
                    else if(s1.charAt(i)!=s2.charAt(i)) return (s1.charAt(i)<=s2.charAt(i))?1:-1;
                }
                
                while(true){
                    if(s1.length()<s2.length()){
                        while(true){
                            if(s2.charAt(i)==s1ors2FinChar){
                                i++;
                            }
                            else {
                            	
                            }
                        }
                        
                    }
                }
                
                
                
                
                
//                 while(true){
//                     if( s1.length()-1>=i && s2.length()-1>=i ){
//                         if(s1.charAt(i)==s2.charAt(i) ){
//                             i++;
//                             continue;
//                         }
//                         else {
//                             return (s1.charAt(i)<=s2.charAt(i))?1:-1;
//                         }
//                     }
//                     else {
//                         if(s1.length()<s2.length()){
//                             while(true){
                                
//                             }
//                         }
//                         else{
                            
//                         }
                        
//                         return (s1.charAt(i-1)>=s2.charAt(i-1))?1:-1;
//                     }
//                 }
                
                
        }});
        
        System.out.println();
        for(int i=0; i<numbersString.length; i++){
            System.out.println(numbersString[i]);
            answer+=numbersString[i];
        }  
            
                
         
                
        
        return answer;
    }
	
	
	// string을 붙인다는 개념을 모르면 위에처럼 멍청하게 하는거임 ㅇㅋ?
	public String solution1(int[] numbers) {
        String answer = "";
        String[] numbersString = new String[numbers.length];
        
        for(int i=0; i<numbersString.length; i++){
            numbersString[i] = Integer.toString(numbers[i]);
            // System.out.println(numbersString[i]);
        }  
        
        Arrays.sort(numbersString, new Comparator<String>(){
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
        }});
        
        System.out.println();
        if(numbersString[0].equals("0")) return "0"; 
        for(int i=0; i<numbersString.length; i++){
            // System.out.println(numbersString[i]);
            answer+=numbersString[i];
        }  
            
                
        // System.out.println(Integer.parseInt("0100"));
                
        
        return answer;
    }
	
	

	
}
