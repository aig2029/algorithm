package algorithm;

public class Problem191107_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// dp는 많이 풀면서 감을 익히는 것이 좋아보인다.
	int solutionDP(int[][] land) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
    
        int[][] dp = new int[land.length][4];
        
        for(int i=0; i<4; i++){
            dp[0][i] = land[0][i];
        }
        
        for(int i=1; i<land.length; i++){
            for(int j=0; j<4; j++){
                for(int k=0; k<4; k++){
                    if(j!=k) dp[i][j] = Math.max(dp[i][j], land[i][j]+dp[i-1][k]);    
                }                
            }
        }
        
        for(int j=0; j<4; j++){
            answer = Math.max(answer, dp[land.length-1][j]);
        }
        
        
        return answer;
    }
	
	
	// 땅따먹기 신박한 코드 DP를 몰라도 센스가 있었으면 이런 방식으로 풀 수 있었을 것이다
	int solution(int[][] land) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        // for(int i=0; i<land.length; i++){
        //     for(int j=0; j<land[0].length; j++){
        //         System.out.print(land[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        for(int i=1; i<land.length; i++){
            land[i][0] += Math.max( land[i-1][1], Math.max( land[i-1][2], land[i-1][3] ) );
            land[i][1] += Math.max( land[i-1][0], Math.max( land[i-1][2], land[i-1][3] ) );
            land[i][2] += Math.max( land[i-1][0], Math.max( land[i-1][1], land[i-1][3] ) );
            land[i][3] += Math.max( land[i-1][0], Math.max( land[i-1][1], land[i-1][2] ) );
        }

        return Math.max( land[land.length-1][0], Math.max( land[land.length-1][1], Math.max(land[land.length-1][2], land[land.length-1][3]) ));
    }

	
}
