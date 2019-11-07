package algorithm;

public class Problem191107_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(int [][]board)
    {
        int answer = 0;
        
        int[] dx= {-1,0,-1};
        int[] dy= {0,-1,-1};
        
        // for(int i=0; i<board.length; i++){
        //     for(int j=0; j<board[0].length; j++){
        //         System.out.print(board[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        int[][] dp = new int[board.length+1][board[0].length+1];
        
        
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                dp[i+1][j+1] = board[i][j];
            }
        }
        
        // System.out.println();
        // for(int i=0; i<dp.length; i++){
        //     for(int j=0; j<dp[0].length; j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                int min=dp[i-1][j-1];
                for(int k=0; k<2; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    
                    min=Math.min(min, dp[nx][ny]);
                }
                if(dp[i][j]==1) dp[i][j]+=min;
                // dp[i][j]+=min;
                answer = Math.max(answer,dp[i][j]);
                
            }
            
        }
        
        // System.out.println();
        // for(int i=0; i<dp.length; i++){
        //     for(int j=0; j<dp[0].length; j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        
        return answer*answer;
    }

	
}
