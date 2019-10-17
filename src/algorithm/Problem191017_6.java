package algorithm;

import java.util.Arrays;

public class Problem191017_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] phyClothes = new int[n];
        Arrays.fill(phyClothes, 1);
        
        for (int i : lost) {
			phyClothes[i-1]--;
		};
        
        for (int i : reserve) {
        	phyClothes[i-1]++;
		};
        	
		for (int i : phyClothes) {
			System.out.println(i);
		}
        
        for (int i = 0; i < phyClothes.length; i++) {
			if(phyClothes[i]==0) {
				if(i>0 && i<phyClothes.length-1) {
					if(phyClothes[i-1]==2) {
						phyClothes[i-1]--;
						phyClothes[i]++;
					}
					else if(phyClothes[i+1]==2) {
						phyClothes[i+1]--;
						phyClothes[i]++;
					}
				}
				else if(i==0 && phyClothes[i+1]==2) {
					phyClothes[i]++;
					phyClothes[i+1]--;
				}
				else if(i==phyClothes.length-1 && phyClothes[i-1]==2) {
					phyClothes[i]++;
					phyClothes[i-1]--;
				}
			}
			
		}
		
		System.out.println();
		
		for (int i : phyClothes) {
			System.out.println(i);
            if(i>=1) answer++;
		}
        
        return answer;
    }

}
