package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem191210_10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(bf.readLine());
		
		int[] height = new int[N];
		int[] answer = new int[N];
		
		Stack<TopInfo> st = new Stack<>();
		
		StringTokenizer stn = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			height[i] = Integer.parseInt(stn.nextToken());
		}
		
		for(int i=N-1; i>=0; i--) {
			TopInfo t = new TopInfo(i, height[i]);
			if(!st.isEmpty()) {
				while(!st.isEmpty()) {
					if(st.peek().height>=t.height) {
						break;
					}
					else {
						answer[st.pop().index] = i+1;
					}				
				}
				st.push(t);
			}
			else st.push(t);
			
		}
		
		for(int i : answer) {
			System.out.print(i+" ");
		}
		
		
	}
	
	static class TopInfo{
		int index;
		int height;
		
		TopInfo(int index, int height) {
			this.index = index;
			this.height = height;
		}
		
	}
	
}
