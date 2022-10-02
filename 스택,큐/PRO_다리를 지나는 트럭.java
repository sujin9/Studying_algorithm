import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int totalWeight = 0;
        int i=0;
        
        while(i<truck_weights.length) {
            answer++;
                
            // 트럭이 비어있는 경우
            if(q.isEmpty()) {
                totalWeight = truck_weights[i];
                q.add(truck_weights[i++]);
                continue;
            }
            
            // 0 삭제
            if(q.peek()==0) {
                answer--;
                q.poll();
                continue;
            }         
            
            // 트럭이 꽉찬 경우
            if(q.size() == bridge_length) {     
                totalWeight -= q.poll();
            }
            
            // 트럭이 있는 경우 - 무게 체크
            if((totalWeight+truck_weights[i])<=weight) {
                totalWeight += truck_weights[i];
                q.add(truck_weights[i++]);
            } else {                
                q.add(0);
            }
        }
        
        return answer + bridge_length;
    }
}