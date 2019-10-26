package algorithm;

public class Problem191026_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 완전탐색 숫자만들기 함수 + 각 숫자들 별로 예제에 나온 정보들 전부 입력시킴
	public int solution(int[][] baseball) {
        int answer = 0;
        
        // for(int i=0; i<baseball[0].length; i++){
        //     System.out.println(baseball[i][0]);
        //     System.out.println(baseball[i][1]);
        //     System.out.println(baseball[i][2]);
        // }
        
        int num = 122;
        while(num<=986){
            num = nextNum(num);
            // System.out.println("지금 넘버:"+num);
            for(int i=0; i<baseball.length; i++){
                int questNum = baseball[i][0];
                int hundred = questNum/100;
                int ten = (questNum-100*hundred)/10;
                int one = questNum%10;
                int digit = 1;
                
                int strike = 0;
                int ball = 0;
                
                int comparisonNum = num;
                
                
                while(comparisonNum>0){
                    
                    int comparisonUnit = comparisonNum%10;
                    if(comparisonUnit==one){
                        if(digit==1) strike++;
                        else ball++;
                    }
                    else if(comparisonUnit==ten){
                        if(digit==2) strike++;
                        else ball++;
                    }
                    else if(comparisonUnit==hundred){
                        if(digit==3) strike++;
                        else ball++;
                    }
                    comparisonNum/=10;
                    digit++;
                }
                
                // System.out.println("스트라이크 : "+strike+", 볼 : " +ball);
                
                if( !(strike==baseball[i][1] && ball==baseball[i][2]) ) {
                    break;
                }
                else {
                    if(i==baseball.length-1) {
                        // System.out.println("예비후보");   
                        System.out.println(num);
                        answer++;
                    } 
                }
                
            }
            // System.out.println();
        }
            
        return answer;
    }
    
    public static int nextNum(int inputNum){
        int returnNum= inputNum;
        int hundred; 
        int ten; 
        int one;
        
        while(true){
            returnNum++;
            if(returnNum%100 == 0) returnNum+=11;
            else if(returnNum%10 == 0) returnNum++;   
            
            hundred = returnNum/100;
            ten = (returnNum-100*hundred)/10;
            one = returnNum%10;
            if(one!=ten && one!=hundred && ten!=hundred) {
                break;
            }     
        }

        return returnNum;
    }

	
}
