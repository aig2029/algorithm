package algorithm;

public class Problem191116_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static int N;
	static int M;
	static int[][] newLock;

	public boolean solution(int[][] key, int[][] lock) {
		boolean answer = false;

		N = lock.length;
		M = key.length;
		newLock = new int[N * 3][N * 3];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				newLock[N + i][N + j] = lock[i][j];
			}
		}

		// for(int i=0; i<M; i++){
		//     for(int j=0; j<M; j++){
		//         System.out.print(key[i][j]);
		//     }
		//     System.out.println();
		// }

		for (int i = 0; i < newLock.length; i++) {
			for (int j = 0; j < newLock.length; j++) {
				System.out.print(newLock[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = N - M; i < 2 * N; i++) {
			for (int j = N - M; j < 2 * N; j++) {
				// i,j is start point
				for (int keyIdx = 0; keyIdx < 4; keyIdx++) {
					key = rotatedKey(key);

					int[][] tempNewLock = initLock();

					for (int k = 0; k < M; k++) {
						for (int l = 0; l < M; l++) {
							tempNewLock[i + k][j + l] = tempNewLock[i + k][j + l] ^ key[k][l];
						}
					}

					//                     for(int c=0; c<M; c++){
					//                         for(int d=0; d<M; d++){
					//                             System.out.print(key[c][d]);
					//                         }
					//                         System.out.println();
					//                     }
					//                     System.out.println();

					//                     for(int a=0; a<3*N; a++){
					//                         for(int b=0; b<3*N; b++){
					//                             System.out.print(tempNewLock[a][b]);
					//                         }
					//                         System.out.println();
					//                     }
					//                     System.out.println();

					if (isUnlocked(tempNewLock))
						return true;
					else
						continue;
				}
			}
		}

		return answer;
	}

	static boolean isUnlocked(int[][] tempNewLock) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (tempNewLock[N + i][N + j] == 0)
					return false;
			}
		}
		return true;
	}

	static int[][] initLock() {
		int[][] initLock = new int[N * 3][N * 3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				initLock[N + i][N + j] = newLock[N + i][N + j];
			}
		}
		return initLock;
	}

	static int[][] rotatedKey(int[][] preKey) {
		int[][] rotatedKey = new int[M][M];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				rotatedKey[j][M - 1 - i] = preKey[i][j];
			}
		}

		//         for(int i=0; i<M; i++){
		//             for(int j=0; j<M; j++){
		//                 System.out.print(rotatedKey[i][j]);
		//             }
		//             System.out.println();
		//         }

		//         System.out.println();

		return rotatedKey;
	}

	
}
