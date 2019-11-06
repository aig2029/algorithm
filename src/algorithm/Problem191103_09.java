package algorithm;

public class Problem191103_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	// DP로 풀어야함 DFS로 깝치면서풀지말고 
	public int solution(int [][]board)
    {
        int answer = 0;
        int modifiedBoard[][] = new int[board.length+1][board[0].length+1];
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==1) modifiedBoard[i+1][j+1]=1;
            }
        }
        
        for(int i=1; i<modifiedBoard.length; i++){
            for(int  j=1; j<modifiedBoard[0].length;j++){
                if(modifiedBoard[i][j]==1){
                    int min = Math.min( modifiedBoard[i-1][j-1], Math.min( modifiedBoard[i-1][j], modifiedBoard[i][j-1] ));
                    modifiedBoard[i][j] = min+1;

                    answer = Math.max( answer , modifiedBoard[i][j] );
                }
            }
        }
        
        for(int i=1; i<modifiedBoard.length; i++){
            for(int  j=1; j<modifiedBoard[0].length;j++){
                System.out.print(modifiedBoard[i][j]+" ");
            }
            System.out.println();
        }

        return answer*answer;
    }

	
//	class Solution
//	{
//	    static int[][] staticBoards;
//	    static int MAX_X;
//	    static int MAX_Y;
//	    static int answer;
//	    
//	    public int solution(int [][]board)
//	    {
//	        answer = 0;
//	        MAX_X = board.length;
//	        MAX_Y = board[0].length;
//
//	        // DFS하지말고 재귀로해야함
//	        staticBoards = new int[MAX_X][MAX_Y];
//	        for(int i=0; i<staticBoards.length; i++){
//	            for(int j=0; j< staticBoards[i].length; j++){
//	                staticBoards[i][j]=board[i][j];
//	                   
//	            }
//	        }
//	        
//	        
//	        for(int i=0; i<staticBoards.length; i++){
//	            for(int j=0; j< staticBoards[i].length; j++){
//	                // System.out.print(staticBoards[i][j]+" ");
//	                if(staticBoards[i][j]==1) DFS(i,j,0);
//	                
//	            }
//	            // System.out.println();
//	        }
//	        
//
//	        return answer;
//	    }
//	    static void DFS(int x, int y, int width){
//	        
//	        
//	        // x+1,y ~ x+1,y+1 ( 1 is width )
//	        for(int k=0; k<=width; k++){
//	            if(x+width<MAX_X && y+k<MAX_Y && staticBoards[x+width][y+k]==1 ){
//	                continue;
//	            }
//	            else return;
//	        }
//	        
//	        
//	        // x, y+1 ~ x+1, y+1 ( 1 is width) 
//	        for(int k=0; k<=width; k++){
//	            if(x+k<MAX_X && y+width<MAX_Y && staticBoards[x+k][y+width]==1 ){
//	                continue;
//	            }
//	            else return;
//	        }
//	        
//	        if( Math.pow(width+1,2) > answer ) answer = (int)Math.pow(width+1,2);
//	        DFS(x,y,width+1);
//	        
//	    }
//	}
	
}
