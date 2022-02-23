package algorithm;

class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        // ex) abc abc (idx1:0 idx2:3 idx3:3 idx4:6)
        
        int startIdx = 0, unit = 1;
        while(unit<=s.length()/2){
            // int[] idx = makeIdxArr(startIdx, unit);
            // for(int i : idx)
            //     System.out.println(i);
            startIdx = 0;            
            int accumNum = 1;
            String preStr = "";
            
            int answerCandi = s.length();
            
            // System.out.println((int)( Math.log10(10)+1 ));
            
            while(true){
                if(startIdx+unit>s.length()){
                    if(accumNum>1)
                        answerCandi+=(int)(Math.log10(accumNum)+1);
                    accumNum = 1;
                    
                    answer = Math.min(answer, answerCandi);
                    break;
                }
            
            
                String currStr = s.substring(startIdx, startIdx+unit);
                
                if(currStr.equals(preStr)){
                    accumNum++;
                    answerCandi -= currStr.length();
                }
                else{
                    /**
                    중복된 문자들 누적된 숫자 처리
                    **/
                    if(accumNum>1)
                        answerCandi+=(int)(Math.log10(accumNum)+1);
                    accumNum = 1;
                    
                  
                }
                preStr = currStr;
                startIdx+=unit;
                // break;
              
            }
            unit++;
        }
        
        
        
        
        
        
        return answer;
    }
    
//     public int[] makeIdxArr(int startIdx, int unit){
//         int[] ret = new int[4];
//         ret[0] = startIdx;
//         ret[1] = startIdx+unit;
//         ret[2] = ret[1];
//         ret[3] = ret[2]+unit;
        
//         return ret;
//     }
}