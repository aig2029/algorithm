package algorithm;

import java.util.Scanner;

public class Problem191214_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); 
		String s = sc.next();
		
		switch (N) {
		case 1:
			String s2 = "";
			for(int i=0; i<s.length(); i++) {
				if('A'<=s.charAt(i) && s.charAt(i)<='Z') {
					s2+=("_"+String.valueOf(s.charAt(i)).toLowerCase());
				}
				else {
					s2+=String.valueOf(s.charAt(i));
				}
			}
			System.out.println(s);
			System.out.println(s2);
			System.out.println(String.valueOf(s.charAt(0)).toUpperCase()+s.substring(1));
			
			break;
		case 2:
			String s1 = "";
			boolean toUpper = false;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='_') {
					toUpper = true;
				}
				else {
					if(toUpper) {
						s1+=String.valueOf(s.charAt(i)).toUpperCase();
						toUpper=false;
					}
					else
						s1+=String.valueOf(s.charAt(i));
					
				}
			}
			System.out.println(s1);
			System.out.println(s);
			System.out.println(String.valueOf(s1.charAt(0)).toUpperCase()+s1.substring(1)); 
			
			break;
		case 3:
			
			String finS2="";
			for(int i=0; i<s.length(); i++) {
				if('A'<=s.charAt(i) && s.charAt(i)<='Z') {
					if(i==0)  
						finS2+=(String.valueOf(s.charAt(i)).toLowerCase());
					else
						finS2+=("_"+String.valueOf(s.charAt(i)).toLowerCase());
				}
				else {
					finS2+=String.valueOf(s.charAt(i));
				}
			}
			System.out.println(String.valueOf(s.charAt(0)).toLowerCase()+s.substring(1));
			System.out.println(finS2);
			System.out.println(s);
			
			break;
		
		}
		
	}
	
	

	
}
