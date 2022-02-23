package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Problem220222_00 {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, User> userMap = new HashMap<>();
        for(String id : id_list)
            userMap.put(id, new User(id));
        // System.out.println(userMap.size());
        
        List<String> bannedIdList = new ArrayList<>();
        for(String r : report){
            String[] stk = r.split(" ");
            String reportUserId = stk[0];
            String reportedUserId = stk[1];
            User reportUser = userMap.get(reportUserId);
            User reportedUser = userMap.get(reportedUserId);
            
            if(!reportUser.reportSet.contains(reportedUserId)){
                reportUser.reportSet.add(reportedUserId);
                if(++reportedUser.reportedNum>=k)
                bannedIdList.add(reportedUser.id);
            }    
        }
        
        // bannedIdList.forEach(s -> System.out.println(s));
        
        // for(String id : id_list)
        //     System.out.println(userMap.get(id).reportedNum);
        int[] answer = new int[id_list.length];
        for(int i=0; i<id_list.length; i++){
            int resultMailNum = 0;
            for(String s : userMap.get(id_list[i]).reportSet){
                // System.out.print(s+" ");
                resultMailNum += (bannedIdList.contains(s))? 1:0;
            }
            // System.out.println();
            answer[i] = resultMailNum;
        }

        return answer;
    }
    
    public class User{
        String id;
        int reportedNum;
        Set<String> reportSet;
        
        User(String id){
            this.id = id;
            reportedNum = 0;
            reportSet = new HashSet<>();
        }
    }
}

