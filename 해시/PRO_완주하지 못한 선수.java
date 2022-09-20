import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0)+1);
        }
        
        for(String s:completion) {
            map.put(s, map.get(s)-1);
        }
        
        Iterator<String> iter = map.keySet().iterator();
        while(iter.hasNext()) {
            String key = iter.next();
            if(map.get(key)==1) {
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}