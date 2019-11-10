package algorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem191110_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String[] solution(String[] record) {
		String[] answer;

		HashMap<String, String> hmId = new HashMap<>();
		ArrayList<String[]> arrList = new ArrayList<>();

		for (int i = 0; i < record.length; i++) {
			// System.out.println(record[i]);
			String[] split = record[i].split(" ");
			if (split[0].equals("Enter") || split[0].equals("Leave")) {
				String[] input = new String[2];
				input[0] = split[0];
				input[1] = split[1];
				arrList.add(input);
			}
			if (split[0].equals("Enter") || split[0].equals("Change")) {
				hmId.put(split[1], split[2]);
			}
		}

		//         System.out.println();
		//         Iterator it = hmId.keySet().iterator();
		//         while(it.hasNext()){
		//             String str = (String)it.next();
		//             System.out.println(str+ " "+hmId.get(str));
		//         }

		//         System.out.println();
		//         for(String[] str : arrList){
		//             System.out.print(str[0]+" "+str[1]+" ");
		//         }

		answer = new String[arrList.size()];
		int i = 0;
		for (String[] str : arrList) {
			String printString = hmId.get(str[1]);

			if (str[0].equals("Enter")) {
				// System.out.println(printString+"님이 들어왔습니다.");
				printString += "님이 들어왔습니다.";
			} else {
				// System.out.println(printString+"님이 나갔습니다.");
				printString += "님이 나갔습니다.";
			}
			answer[i++] = printString;
		}

		return answer;
	}

	
}
