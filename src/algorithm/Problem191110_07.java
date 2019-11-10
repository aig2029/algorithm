package algorithm;

import java.util.ArrayList;

public class Problem191110_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	// 실패코드 테케 4개인가 틀림ㅇ
	static String[][] sRelation;
    static int attributeNum = 0;
    static int answer = 0;
    static ArrayList<String> indexCombination;
    
    public int solution(String[][] relation) {
        
        indexCombination=new ArrayList<>();
        answer=0;
        // for(int i=0; i<relation.length; i++){
        //     for(int j=0; j<relation[0].length; j++){
        //         System.out.print(relation[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        
        sRelation = relation;
        
        boolean[] visited;
        
        visited= new boolean[relation[0].length];
        
        // 1개, 2개, 3개, ..n개까지
        int[] arr = new int[relation.length];
        for(int i=0; i<arr.length; i++){
            arr[i]=i;
        }
        
        for(int i=1; i<=relation[0].length; i++){
            comb(arr, visited, 0, relation[0].length, i);    
        }
        // 사용 예시 : comb(arr, visited, 0, n, r)
        
        
        return indexCombination.size();
    }
    
    // 사용 예시 : comb(arr, visited, 0, n, r)
    static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
        if(r == 0) {
            print(arr, visited, n);
            return;
        }
        if(depth == n) {
            return;
        } else {
            visited[depth] = true;
            comb(arr, visited, depth + 1, n, r - 1);
 
            visited[depth] = false;
            comb(arr, visited, depth + 1, n, r);
        }
    }
 
    // 배열 출력
    static void print(int[] arr, boolean[] visited, int n) {
        ArrayList<String> duplicationChecker = new ArrayList<>();
        String indexComb = "";
       
        
        for(int j=0; j<sRelation.length; j++){
            String input = "";
            for(int i=0; i<n; i++) {
                if(visited[i] == true){
                    System.out.print(arr[i] + " ");
                    input+=(sRelation[j][i]+" ");
                    indexComb+=Integer.toString(i);
                    
                }
            }
            
            if(duplicationChecker.contains(input)) return;
            else duplicationChecker.add(input);
        }
        indexComb = indexComb.substring(0,indexComb.length()/sRelation.length);
        
        
        for(String str : indexCombination){
            if(indexComb.contains(str)) return;
        }
        indexCombination.add(indexComb);
        System.out.println(indexComb);
        
        
        
        // System.out.println("앤서증가");
    }

	
}
