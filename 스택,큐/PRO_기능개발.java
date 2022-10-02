import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
   //     int[] answer = new int[progresses.length];
        ArrayList<Integer> answer = new ArrayList<>();
        int numFinished = 0;
        int cnt = 0;
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<progresses.length; i++)
            q.add(progresses[i]);
        
        while(!q.isEmpty()) {

            for(int i=numFinished; i<progresses.length; i++) {
                int v = q.poll();
                v += speeds[i];
                q.add(v);
            }
            
            while(q.peek()!=null && q.peek()>=100) {
                q.poll();
                cnt++;
            }
            
            if(cnt>0) {
                answer.add(cnt);
                numFinished += cnt;
                cnt = 0;
            }
            
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}