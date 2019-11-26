package algorithm;

import java.util.ArrayList;

public class Problem191126_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 테케8 한개 맞음
	public int[][] solution(int n, int[][] build_frame) {
        int[][] answer;
        
        int[][] pillar = new int[n+1][n+1];     // 기둥
        int[][] beam = new int[n+1][n+1];       // 보
        
        for(int i=0; i<build_frame.length; i++){         // 총 길이 k
            int x = build_frame[i][0];
            int y = build_frame[i][1];
            int structure = build_frame[i][2]; // 기둥/보 (0/1)
            int instOrDel = build_frame[i][3]; // 삭제/설치 (0/1)
            
            //기둥은 바닥 위에 있거나 보의 한쪽 끝 부분 위에 있거나, 또는 다른 기둥 위에 있어야 합니다.
            //보는 한쪽 끝 부분이 기둥 위에 있거나, 또는 양쪽 끝 부분이 다른 보와 동시에 연결되어 있어야 합니다.
            
            if(instOrDel==1){
                System.out.println("설치시작^^");
                if(structure == 0){
                    if(y==0 || beam[x][y]>=1 || pillar[x][y]>=1 ){
                        pillar[x][y]++;
                        pillar[x][y+1]++;
                    }
                }
                if(structure == 1){
                    if( pillar[x][y]>=1 || pillar[x+1][y]>=1 || (beam[x][y]>=1 && beam[x+1][y]>=1) ){
                        beam[x][y]++;
                        beam[x+1][y]++;
                    }
                }
            }
            if(instOrDel==0){
                System.out.println("삭제시작^^");
                
                if(structure == 0){
                    if( beam[x][y+1]>=1 ){
                                  
                        if( (beam[x-1][y+1]>=2 && beam[x+1][y+1]>=2) || (beam[x-1][y+1]>=1 && pillar[x-1][y-1]>=1) || beam[x+1][y+1]>=1 && pillar[x+1][y-1]>=1 ){
                            pillar[x][y]--;
                            pillar[x][y+1]--;
                            
                        }
                    }
                    // beam[x][y+1]==2  이부분은 일단 짬시킴.
                }
                if(structure == 1){
                    if ( pillar[x][y-1] ==1 || pillar[x+1][y-1]==1){
                        beam[x][y]--;
                        beam[x+1][y]--;
                    }
                }
                
                
                
            }
            System.out.print(build_frame[i][0]+" ");
            System.out.print(build_frame[i][1]+" ");
            System.out.print(build_frame[i][2]+" ");
            System.out.print(build_frame[i][3]+" ");
            System.out.println();
        }
        
        for(int j=n; j>=0; j--){
            for(int i=0; i<n+1; i++){
                System.out.print(pillar[i][j]+" ");    
            }
            System.out.println();
        }
        System.out.println();
        
        for(int j=n; j>=0; j--){
            for(int i=0; i<=n; i++){
                System.out.print(beam[i][j]+" ");    
            }
            System.out.println();
        }
        System.out.println();
        
        
        ArrayList<Structure> arr = new ArrayList<>();
        
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(pillar[i][j]>=1){
                    arr.add(new Structure(i,j,0));
                    pillar[i][j]--;
                    pillar[i][j+1]--;
                }
                if(beam[i][j]>=1){
                    arr.add(new Structure(i,j,1));
                    beam[i][j]--;
                    beam[i+1][j]--;
                }
            }
        }
        
        
        answer = new int[arr.size()][3];
        
        for(int i=0; i<arr.size(); i++){
            answer[i][0] = arr.get(i).x;
            answer[i][1] = arr.get(i).y;
            answer[i][2] = arr.get(i).kind;
            System.out.println(arr.get(i));
        }
       
        return answer;
    }
    
    class Structure{
        int x;
        int y;
        int kind;
        
        Structure ( int x, int y, int kind ){
            this.x = x;
            this.y = y;
            this.kind = kind;
        }
        
        public String toString(){
            return x+" "+y+" "+kind;
        }
        
    }

	
}
