package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem191129_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
//		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println(arr.indexOf(4));
	}
	
	public int solutionFin(int distance, int[] rocks, int n) {
		int answer = 0;
		Arrays.sort(rocks);
		// for(int i : rocks){
		//     System.out.println(i);
		// }
		// System.out.println();

		int cnt, current;

		int left = 0, right = distance, mid = 0;
		while (left <= right) {
			int min = distance;
			cnt = 0;
			mid = (left + right) / 2;
			current = 0;
			for (int i = 0; i < rocks.length; i++) {
				if (rocks[i] - current < mid)
					cnt++;
				else {
					min = Math.min(min, rocks[i] - current);
					current = rocks[i];
				}
			}
			if (distance - current < mid)
				cnt++;

			// System.out.println(left+" "+mid+" "+right);
			// System.out.println(cnt);
			// System.out.println(min);

			if (cnt > n) {
				right = mid - 1;
			}
			// 정말 이해가 안가는 부분인데 cnt==n말고 cnt<n인 부분 또한 answer를 정의할 수 있는 것이 가능하다는 건 이해가 안간다..
			else {
				// 이걸 이렇게 박는 것으로 봐서는 이분탐색 탈출 후 최종 mid값이 문제에서 요구하는 최적해가 아니라는 소리가 아닌가 싶다..참 헷갈린다

				answer = Math.max(answer, mid);

				left = mid + 1;
			}
			// System.out.println(answer);
			// System.out.println();
			// if(cnt==n) answer = Math.max(answer,min);

		}

		return answer;
	}
	
	
	// keep2 이거 풀 수 잇을런지 모르겟다 ㄹㅇ..
	public int solution1(int distance, int[] rocks, int n) {
		// PriorityQueue<Integer> pq = new PriorityQueue<>();

		// 각 바위사이의 거리가 있는데(출발점 도착점 사이 거리도 포함) 가장 작은 거리부터 제거해주는 식으로 하면 풀 수 있을 것 같다
		// 하지만 이게 문제가 뭐냐면 특정한 바위rocks[i] 를 제거하면 그 뒤에 있는 바위까지의 거리 rocks[i]~rocks[i+1] 또한 갱신이
		// 되는데 PQ로 해결하려면 index도 같이 넣어야 되나 고민이 된다..으오우예아 저 index순서를 고정시켜주면서 가장 거리가 짧은
		// 지점사이의 거리를 찾아야되는데 그러면 최악의 경우 50000*50000이된다. 그렇다고 최소값순으로 정렬시키면 index를 잃어버리게
		// 되어서 해당 바위를 지우는 순간 연쇄되어 바뀌는 지점거리를 찾아서 수정할 수  없게된다

		int answer = 0;

		Arrays.sort(rocks);

		List<Integer> distanceList = new LinkedList<>();

		for (int i = 0; i < rocks.length; i++) {
			if (i == 0)
				distanceList.add(rocks[i]);
			else
				distanceList.add(rocks[i] - rocks[i - 1]);
		}
		distanceList.add(distance - rocks[rocks.length - 1]);

		//         System.out.println();

		//         for(int i=0; i<distanceList.size(); i++){
		//             if(i==distanceList.size()-1) System.out.println(distance+" "+distanceList.get(i));
		//             else System.out.println(rocks[i]+" "+distanceList.get(i));
		//         }

		int minDistance = 1;
		Loop1: while (n > 0) {
			int idx = distanceList.indexOf(minDistance);
			if (0 <= idx && idx < distanceList.size() - 1) {
				int a = distanceList.get(idx);
				int b = distanceList.get(idx + 1);
				distanceList.add(idx, a + b);
				distanceList.remove(idx + 1);
				distanceList.remove(idx + 1);
				n--;
			} else {
				minDistance++;
				continue Loop1;
			}
		}

		//         for(int i=0; i<distanceList.size(); i++){
		//             System.out.println(distanceList.get(i));

		//         }

		// 늘 가장 작은 값을 이분탐색으로 찾는거임 늘 가장 작은 거리. 그래야 그것을 이용해서 최종값을 return해주든 제거하고 뒤에거
		// 처리해줄 수 있음

		return Collections.min(distanceList);
	}
	
	
	
	// Keep
	public int solution(int distance, int[] rocks, int n) {
		// PriorityQueue<Integer> pq = new PriorityQueue<>();

		// 각 바위사이의 거리가 있는데(출발점 도착점 사이 거리도 포함) 가장 작은 거리부터 제거해주는 식으로 하면 풀 수 있을 것 같다
		// 하지만 이게 문제가 뭐냐면 특정한 바위rocks[i] 를 제거하면 그 뒤에 있는 바위까지의 거리 rocks[i]~rocks[i+1] 또한 갱신이
		// 되는데 PQ로 해결하려면 index도 같이 넣어야 되나 고민이 된다..으오우예아 저 index순서를 고정시켜주면서 가장 거리가 짧은
		// 지점사이의 거리를 찾아야되는데 그러면 최악의 경우 50000*50000이된다. 그렇다고 최소값순으로 정렬시키면 index를 잃어버리게
		// 되어서 해당 바위를 지우는 순간 연쇄되어 바뀌는 지점거리를 찾아서 수정할 수  없게된다

		int answer = 0;

		Arrays.sort(rocks);

		List<Integer> distanceList = new LinkedList<>();
		List<Integer> distanceAsceded = new LinkedList<>();

		for (int i = 0; i < rocks.length; i++) {
			if (i == 0)
				distanceList.add(rocks[i]);
			else
				distanceList.add(rocks[i] - rocks[i - 1]);
		}
		distanceList.add(distance - rocks[rocks.length - 1]);

		System.out.println();
		for (int i : distanceList)
			System.out.println(i);

		for (int i = 0; i < distanceList.size(); i++) {
			if (i == distanceList.size() - 1)
				System.out.println(distance + " " + distanceList.get(i));
			else
				System.out.println(rocks[i] + " " + distanceList.get(i));
		}

		return answer;
	}

	//     class Distance{
	//         int index;
	//         int distance;

	//         Distance(int index, int distance){
	//             this.index = index;
	//             this.distance = distance;
	//         }
	//         void frontRockRemoved(){
	//             this.index--;
	//         }
	//     }

	
}
