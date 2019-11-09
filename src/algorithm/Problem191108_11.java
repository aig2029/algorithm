package algorithm;

import java.util.Scanner;

public class Problem191108_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] candy = new int[N+1];
		
		int total=0;
		for(int i=1; i<=N; i++) {
			candy[i]=sc.nextInt();
			total+=candy[i];
		}
		total/=2;
//		System.out.println(total);
		
		
		for(int i=1; i<=N; i++) {
			int min = 0;
			
			int j=i+1;
			while(true) {
				if(j>N) j-=N;
				if(j==i) break;
				min+=candy[j];
				j+=2;
			}
			System.out.println(total-min);
			
		}
		
	}

	
}
