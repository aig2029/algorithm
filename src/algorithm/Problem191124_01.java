package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Problem191124_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// 플로이드-워셜 알고리즘
	public int solution2(int n, int[][] results) {
		int answer = 0;

		boolean[][] win = new boolean[n + 1][n + 1];

		for (int i = 0; i < results.length; i++) {
			win[results[i][0]][results[i][1]] = true;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if (win[j][i] && win[i][k]) {
						win[j][k] = true;
					}
				}
			}
		}

		// for(int i = 1; i < n + 1; i++) {
		//     boolean pass = true;
		//     for(int j = 1; j < n + 1; j++) {
		//         if(i != j && !(win[i][j] || win[j][i])) {
		//             pass = false;
		//             break;
		//         }
		//     }
		//     if(pass) {
		//         answer++;
		//     }
		// }

		Loop1: for (int i = 1; i <= n; i++) {
			int num = 0;
			for (int j = 1; j <= n; j++) {
				if (i != j) {
					if (win[i][j] || win[j][i])
						num++;
					else
						continue Loop1;
				}
			}
			answer++;
		}

		return answer;
	}
	
	// 그래프, HashSet, 
	public int solution1(int n, int[][] results) {
		int answer = 0;
		ArrayList<RankNode> list = new ArrayList<>();
		list.add(new RankNode(0));
		for (int i = 1; i <= n; i++) {
			list.add(new RankNode(i));
		}

		for (int[] r : results) {
			list.get(r[1]).lose.add(r[0]);
			list.get(r[0]).win.add(r[1]);
		}
		for (int k = 0; k < 2; k++) {
			for (int i = 1; i <= n; i++) {
				RankNode rn = list.get(i);
				HashSet<Integer> tmp = new HashSet<>();
				for (Integer win : rn.win) {
					for (Integer w : list.get(win).win) {
						tmp.add(w);
					}
				}
				rn.win.addAll(tmp);
				tmp = new HashSet<>();

				for (Integer lose : rn.lose) {
					for (Integer l : list.get(lose).lose) {
						tmp.add(l);
					}
				}
				rn.lose.addAll(tmp);

			}
		}
		for (RankNode rn : list) {
			int size = rn.win.size();
			size += rn.lose.size();
			if (size >= n - 1)
				answer++;
		}

		return answer;
	}

	class RankNode {
		int key;
		HashSet<Integer> lose;
		HashSet<Integer> win;
		boolean isRank;

		public RankNode(int k) {
			key = k;
			lose = new HashSet<>();
			win = new HashSet<>();
			isRank = false;
		}
	}
		
	// keep 처음부터 다시 풀어야되는 코드
	public int solution(int n, int[][] results) {
        int answer = 0;
        
        boolean[][] win = new boolean[n+1][n+1];
        int[] fightNum = new int[n+1];
        int[] playerLevel = new int[n+1];
        
        int[] winNum = new int[n+1];
        int[] loseNum = new int[n+1];
        
        
        for(int i=0; i<results.length; i++){
            System.out.println(results[i][0]+" "+results[i][1]);
            int a = results[i][0];
            int b = results[i][1];
            win[a][b] = true;
            fightNum[a]++;
            fightNum[b]++;
            
            winNum[a]++;
            loseNum[b]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1; i<=n; i++){
            if(fightNum[i]==n-1) {
                answer++;
                q.offer(i);
                playerLevel[loseNum[i]+1]=i;
                System.out.println(i+ "레벨"+playerLevel[i]);
            }
        }
        
        while(!q.isEmpty()){
            int now = q.poll();
            System.out.println("현재 now : "+now); // now는 확실하게 증명됨
            
            for(int i=1; i<=n; i++){
                System.out.println("--현재 i : "+i);
                if(playerLevel[i]==0){
                    if( win[now][i] ){
                        int goMax = playerLevel[now]+1;
//                        for(int k=i+1; k<=n; k++){
//                            if(playerLevel[])
//                        }
//                        
//                        playerLevel[i]=playerLevel[now]+1;
                    }
                    // if( win[i][now] && level[num]+ )
                    answer++;
                    System.out.println("현재 answer : "+answer);
                    q.offer(i);
                }
            }
            break;
            
        }
        
        
        
//         for(int i=1; i<=n; i++){
            
//             int num=0;
//             System.out.println(i);
//             for(int j=1; 1<=n; j++){
//                 // if( win[j][i] || win[i][j] ) num++;
//             }
//             if(num==n-1) {
//                 System.out.println(num);
//             }
//         }
        
        
        return answer;
	}

	
}
