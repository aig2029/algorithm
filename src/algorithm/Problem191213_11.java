package algorithm;

public class Problem191213_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int[][] baseball) {
        int answer = 0;
        
        boolean[] used = new boolean[10];
        
        int strike, ball, rightConditionNum;
        
        for(int hun=1; hun<=9; hun++){
            used[hun]=true;
            for(int ten=1; ten<=9; ten++){
                if(used[ten]) continue;
                used[ten]=true;
                for(int one=1; one<=9; one++){
                    if(used[one]) continue;
                    used[one]=true;
                    
                    
                    rightConditionNum=0;
                    for(int i=0; i<baseball.length; i++){
                        strike=0;
                        ball=0;
                        
                        int temp = baseball[i][0];
                        int oneTemp = temp%10;
                        temp/=10;
                        int tenTemp = temp%10;
                        temp/=10;
                        int hunTemp = temp%10;
                        
                        if(hun==hunTemp) strike++;
                        if(ten==tenTemp) strike++;
                        if(one==oneTemp) strike++;
                        if(hun==tenTemp || hun==oneTemp) ball++;
                        if(ten==hunTemp || ten==oneTemp) ball++;
                        if(one==hunTemp || one==tenTemp) ball++;
                        
                        if(strike==baseball[i][1] && ball==baseball[i][2]) rightConditionNum++;

                    }
                    if(rightConditionNum==baseball.length) answer++;
                    
                    // System.out.println(hun+" "+ten+" "+one);
                    
                    
                    used[one]=false;
                }
                
                used[ten]=false;
                
            }
            used[hun]=false;
        }
        
        return answer;
    }
	
	

	
}
