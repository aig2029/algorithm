package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem191020_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> newq = new LinkedList<>();
		
//		newq.offer(2);
//		System.out.println(newq.peek());
		
		sc.nextLine();
		
		int rear=-1;
		for(int i=0; i<N; i++) {
			String cmd = sc.nextLine();
			String[] cmdSplit = cmd.split(" ");
			
			
			
//			if(cmdSplit.length == 1) {
//				System.out.println(cmdSplit[0]);
//			}
//			else {
//				System.out.println(cmdSplit[0]);
//				System.out.println(cmdSplit[1]);
//			}
			
			if(cmdSplit[0].equals("push")) {
				rear=Integer.parseInt(cmdSplit[1]);
				newq.offer(rear);
				
			}
			else if(cmdSplit[0].equals("pop")) {
				if(newq.size()==0) {	
					System.out.println("-1");
					rear=-1;
				}
				else {
					System.out.println(newq.poll());
				}
			}
			else if(cmdSplit[0].equals("size")) {
				System.out.println(newq.size());
			}
			else if(cmdSplit[0].equals("empty")) {
				if(newq.size()==0) {
					System.out.println("1");
				}
				else System.out.println("0");
			}
			else if(cmdSplit[0].equals("front")) {
				if(newq.size()==0) {
					System.out.println("-1");
				}
				else {
					System.out.println(newq.peek());
				}
			}
			else if(cmdSplit[0].equals("back")) {
				if(newq.size()==0) {
					System.out.println("-1");
				}
				else {
					System.out.println(rear);
				}
			}
			
			/* for(int j=0; j<cmdSplit.length; i++) {
			 * 
			 * } */
			
		}
		
	}
	
}
