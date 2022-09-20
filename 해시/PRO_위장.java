import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> closet = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++) {
            String[] cloth = clothes[i];
            closet.put(cloth[1], closet.getOrDefault(cloth[1], 0)+1);
        }

        for(String s:closet.keySet()) {
            answer *= (closet.get(s)+1);    
        }
          
        answer -= 1;
        return answer;
    }
    
}