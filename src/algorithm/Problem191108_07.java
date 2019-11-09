package algorithm;

public class Problem191108_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isP1("zzzz",0,3));
		
	}
	
	public int solution(int n) {
        int ans = 0;

        
        System.out.println(n);
        while(n>0){
            if(n%2==0) n/=2;
            else {
                n--;
                ans++;
            }
             
        }
        
        
        return ans;
    }
	
	
	// 밑에는 stackoverflow고ㅓㅏㄴ련된거 문제랑 상관 x
	static boolean isP (String str, int low, int high) {
		if(low>high) {
			return true;
		}
		else { 
			return str.charAt(low)==str.charAt(high)&& isP(str,low+1,high-1);
		}
	}
	
	static boolean isP1 (String str, int low, int high) {
		
		return (low>high) || str.charAt(low)==str.charAt(high)&& isP(str,low+1,high-1);
		
	}

	
}
