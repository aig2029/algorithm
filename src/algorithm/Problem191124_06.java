package algorithm;

public class Problem191124_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	int MOD = 20170805;
	public int solution(int m, int n, int[][] cityMapInput) {
		int answer = 0;
		int[][] cityMap = new int[m + 1][n + 1];

		for (int i = 0; i < cityMapInput.length; i++) {
			for (int j = 0; j < cityMapInput[0].length; j++) {
				cityMap[i + 1][j + 1] = cityMapInput[i][j];
			}
		}

		// for(int i=0; i<cityMap.length; i++){
		//     for(int j=0; j<cityMap[0].length; j++){
		//         System.out.print(cityMap[i][j]+" ");
		//     }
		//     System.out.println();
		// }
		// System.out.println();

		int[][] canRight = new int[m + 1][n + 1];
		int[][] canDown = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j == 1) {
					canRight[1][1] = 1;
					canDown[1][1] = 1;
				} else {
					if (cityMap[i][j] == 1) {
						canRight[i][j] = 0;
						canDown[i][j] = 0;
					} else if (cityMap[i][j] == 2) {
						canRight[i][j] = canRight[i][j - 1];
						canDown[i][j] = canDown[i - 1][j];
					} else {
						canRight[i][j] = (canRight[i][j - 1] + canDown[i - 1][j]) % 20170805;
						canDown[i][j] = (canRight[i][j - 1] + canDown[i - 1][j]) % 20170805;

					}
				}
			}
		}

		// for(int i=1; i<=m; i++){
		//     for(int j=1; j<=n; j++){
		//         // System.out.println(canRight[m][n]);
		//         // System.out.println(canDown[m][n]);
		//     }
		// }

		return canDown[m][n];
	}

	
}
