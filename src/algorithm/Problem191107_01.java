package algorithm;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class Problem191107_01 {

	public static void main(String[] args) {
		
	}
	
	final static int MAX_SIZE=101;
    static boolean[][] visited = new boolean[MAX_SIZE][MAX_SIZE];
    static int numberOfArea = 0;  
    static int maxSizeOfOneArea = 0;  
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    
    static Queue<Point> q = new LinkedList<>();
    static int maxX=0;
    static int maxY=0;
    static int[][] sPicture;
    static int sizeOfOneArea=0;
    
    static void init(){
        visited = new boolean[MAX_SIZE][MAX_SIZE];
        numberOfArea = 0;  
        maxSizeOfOneArea = 0;  
        // dx = { -1, 1, 0, 0 };
        // dy = { 0, 0, -1, 1 };

        Queue<Point> q = new LinkedList<>();
        maxX=0;
        maxY=0;
        sPicture= new int[0][0];
        sizeOfOneArea=0;
    }
    
    
    public int[] solution(int m, int n, int[][] picture) {
        init();
        
        maxX=m;
        maxY=n;
        
        sPicture=picture;
        
        for(int i=0; i<m; i++){
          for(int j=0; j<n; j++){
              // System.out.print(picture[i][j]+" ");
              if(picture[i][j]!=0 && !visited[i][j]) BFS(i,j);
          }
          // System.out.println();
        }
        
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
        
        
    }
    static void BFS(int i, int j){
        numberOfArea++;
        // System.out.println("("+i+","+j+")");
        
        sizeOfOneArea=0;
        
        q.offer(new Point(i,j));
        visited[i][j]=true;
        
        
        while(!q.isEmpty()){
            Point now = q.poll();
            sizeOfOneArea++;
            
            int x = now.x;
            int y = now.y;
            
            for(int k=0; k<4; k++){
                int nx = x+dx[k];
                int ny = y+dy[k];
                
                if(nx>=0 && nx<maxX && ny>=0 && ny<maxY){
                    if(sPicture[x][y]==sPicture[nx][ny] && !visited[nx][ny]){
                        q.offer(new Point(nx,ny));
                        visited[nx][ny]=true; 
                    }
                }
            }
            
        }
        
        if(sizeOfOneArea>maxSizeOfOneArea) maxSizeOfOneArea= sizeOfOneArea;
        System.out.println(sizeOfOneArea+ " ("+i+", "+j+")");
        
        	
        	
    }
}


