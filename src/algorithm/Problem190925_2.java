package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Problem190925_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			arr.add(sc.nextInt());
		}

		/* for (Integer integer : arr) { System.out.println(integer); } */

		Collections.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (o1 > o2)
					return 1;
				else if (o1 < o2)
					return -1;
				return 0;
			}
		});

		/* for (Integer integer : arr) { System.out.println(integer); } */

		System.out.println(arr.get(arr.size() / 2));
	}
}
