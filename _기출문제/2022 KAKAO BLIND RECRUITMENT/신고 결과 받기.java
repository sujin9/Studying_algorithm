import java.util.HashMap;
import java.util.HashSet;

class Solution {
    
    public int getIndexByName(String[] id_list, String name) {
        for(int i=0; i< id_list.length; i++) {
            if(name.equals(id_list[i]))
                return i;
        }
        return -1;
    }
    
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> reportUsers = new HashMap<>(id_list.length);

        for(String r:report) {
            String[] name = r.split(" ");

            if(reportUsers.get(name[1])==null) {
                HashSet<String> users = new HashSet<>();
                users.add(name[0]);
                reportUsers.put(name[1], users);
            }
            else {
                reportUsers.get(name[1]).add(name[0]);
            }

        }

        for(int i=0; i<id_list.length; i++) {
            HashSet<String> users = reportUsers.get(id_list[i]);
            if(users==null) continue;

            if(users.size()>=k) {
                for(String id:users) {
                    int index = getIndexByName(id_list, id);
                    answer[index]++;
                }
            }
        }
        
        return answer;
    }
}