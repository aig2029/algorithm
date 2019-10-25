package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Problem191025_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	// 솔직히 문제가 너무 쉬워서 for문 깡으로하면 시간,메모리에서 탈일것같았고
	// 또 다른 필승법이 있는줄 알았는데 그냥 for문 깡으로하면 된다
	
	public boolean solution(String[] phone_book) {
        boolean answer = true;

        ArrayList<String> pbList = new ArrayList<>();
        
        for(int i=0; i<phone_book.length; i++){
            pbList.add(phone_book[i]);
        }
        
        Collections.sort(pbList, new Comparator<String>(){
            public int compare ( String s1, String s2){
                if(s1.length()>s2.length()){
                    return 1;
                }
                else if(s1.length()==s2.length()){
                    return (s1+s2).compareTo(s2+s1);
                }
                else return -1;
            }
        });
        
        for(int i=0; i<pbList.size(); i++){
            for(int j=i+1; j<pbList.size(); j++){
                if(pbList.get(j).indexOf(pbList.get(i))==0) return false;
            }
        }
        
   
        
        return answer;
    }
	
	public boolean solution1(String[] phone_book) {
        boolean answer = true;
        
        for(int i=0; i<phone_book.length; i++){
            for(int j=i+1; j<phone_book.length; j++){
                
                if(phone_book[j].startsWith(phone_book[i])) return false;
                if(phone_book[i].startsWith(phone_book[j])) return false;    
                
            }
            
            System.out.println(phone_book[i]);
        }
        
        return answer;
    }
	
	

	
}
