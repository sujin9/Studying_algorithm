import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:priorities)
            list.add(i);
        
        while(!list.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                if(priorities[i] == list.peek()) {
                    if(i==location) {
                        return ++answer;
                    }
                    list.poll();
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}