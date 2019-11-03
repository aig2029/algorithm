package algorithm;

public class Problem191103_06 {
	
	static int answer = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {};
		int target =0;
		
		
		System.out.println(solution(numbers,target));
	}
	
	public static int solution(int[] numbers, int target) {
        
        DFS(numbers, target, 0);
        
        return answer;
    }
   
    static void DFS(int[] numbers, int target, int k){

        if(k==numbers.length ){
            int total=0;
            for(int i=0; i<numbers.length;i ++){
                total+=numbers[i];
            }
            
            
            if(total==target) {
                
                // for(int i=0; i<numbers.length; i++){
                //  System.out.print(numbers[i]+" ");
                // }   
                // System.out.println();
                answer++;
            }
            return;
        }
        
        numbers[k]*=1;
        DFS(numbers, target, k+1);
        numbers[k]*=-1;
        DFS(numbers, target, k+1);
     
    }

}
