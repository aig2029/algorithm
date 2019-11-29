package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Problem191129_02 {
	
	static HashMap<Integer,Integer> hm = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grade = {2,2,1};
		int[] grade1 = {3,2,1,2};
		
		solution(grade,grade.length);
		System.out.println();
		solution(grade1,grade1.length);
		
		
		
	}
	
	static public int[] solution(int[] grade, int grade_len) {
		int[] sol = new int[grade_len];
		Integer[] gr = new Integer[grade_len];
		for(int i=0; i<grade_len; i++){
			gr[i] = grade[i];
		}
		
		Arrays.sort(gr, Collections.reverseOrder());
		
		int sw=0;
		int pre=-1;
		int accum=1;
		for(int i=0; i<grade_len; i++) {
			if(gr[i]!=pre) {
				sw+=accum;
				accum=1;
			}
			else accum++;
			
			sol[i]=sw;
			pre=gr[i];
			
			hm.put(gr[i], sw);
		}
		

		
		for(int i=0; i<grade_len; i++) {
			sol[i]=hm.get(grade[i]);
		}
		
		for (int i : sol) {
			System.out.println(i);
		}
		
		
		
		return sol;
	}

	
}
