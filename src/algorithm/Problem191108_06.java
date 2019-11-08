package algorithm;

import java.util.Arrays;

public class Problem191108_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	static boolean[] sosu;

	public int solution(int[] nums) {
		int answer = 0;

		sosuMaker();

		// for(int i=0; i<nums.length; i++){
		//     System.out.println(nums[i]);
		// }

		int leng = nums.length;

		for (int i = 0; i < leng - 2; i++) {
			for (int j = i + 1; j < leng - 1; j++) {
				for (int k = j + 1; k < leng; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if (sosu[sum])
						answer++;

					// System.out.println(sum);
					// System.out.print(nums[i]+" "+nums[j]+" "+nums[k]);
					// System.out.println();
				}
			}
		}

		return answer;
	}
	// static boolean isPrime(int num){
	// boolean flag = true;
	// for(int i=2; i*i<=num; i++){
	//     if(num%i == 0){
	//         flag = false;
	//         break;
	//     }
	// }
	// return flag;
	// }

	static void sosuMaker() {
		sosu = new boolean[10001];
		Arrays.fill(sosu, true);
		for (int i = 2; i < sosu.length; i++) {
			for (int j = 2; i * j < sosu.length; j++) {
				if (!sosu[i * j])
					continue;
				sosu[i * j] = false;
			}
		}

		System.out.println(sosu[113]);
	}
	
	
	

	
}
