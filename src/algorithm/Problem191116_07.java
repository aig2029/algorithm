package algorithm;

import java.util.Scanner;

public class Problem191116_07 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i=0; i<T; i++) {
			String inputStr = sc.nextLine();
			int input = Integer.parseInt(inputStr);
			
//			System.out.println(input);
			int year = input/10000;
			input%=10000;
			int month = input/100;
			if(month<1) {
				System.out.println("#"+(i+1)+" "+-1);
				continue;
			}
			int day = input%100;
			
			if(days[month]<day) {
				System.out.println("#"+(i+1)+" "+-1);
				continue;
			}
			
			System.out.println("#"+(i+1)+" "+inputStr.substring(0,4)+"/"+inputStr.substring(4,6)+"/"+inputStr.substring(6,8));
		}
		
		
	}

}
