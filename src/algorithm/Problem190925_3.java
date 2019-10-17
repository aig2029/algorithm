package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem190925_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A, B, N;
		A = sc.nextInt();
		B = sc.nextInt();
		N = sc.nextInt();

		int[][] matrix = new int[A][B];

		for (int i = 0; i < A; i++) {
			for (int j = 0; j < B; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();

		while (true) {
			//			int awayFromEdge=1;

			arr.add(matrix[0][0]);

			int k = 1;

			// 윗변
			while (true) {
				arr.add(matrix[0][k]);
				matrix[0][k] = arr.get(0);
				arr.remove(arr.get(0));
				if (k++ == B-1) {
					k = 1;
					break;
				}
			}
			
			// 우변
			while (true) {
				arr.add(matrix[k][3]);
				matrix[k][3] = arr.get(0);
				arr.remove(arr.get(0));
				if (k++ == A-1) {
					k = B-2;
					break;
				}
			}
			
			// 아랫변
			while (true) {
				arr.add(matrix[3][k]);
				matrix[3][k] = arr.get(0);
				arr.remove(arr.get(0));
				if (k-- == 0) {
					k = A-2;
					break;
				}
			}
			
			// 좌변
			while (true) {
				arr.add(matrix[k][0]);
				matrix[k][0] = arr.get(0);
				arr.remove(arr.get(0));
				if (k-- == 0) {
					k = 0;
					break;
				}
			}

			System.out.println(arr.get(0));

			/* arr.add(matrix[0][1]); matrix[0][1] = arr.get(0); arr.remove(arr.get(0));
			 * 
			 * System.out.println(arr.get(0));
			 * 
			 * arr.add(matrix[0][2]); matrix[0][2] = arr.get(0); arr.remove(arr.get(0));
			 * 
			 * System.out.println(arr.get(0)); */
			break;
		}

		for (int i = 0; i < A; i++) {
			for (int j = 0; j < B; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
