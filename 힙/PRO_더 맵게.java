import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i:scoville)
            pq.add(i);

        while(true) {
            int k = pq.poll();
            if(k>=K) break;

            k += pq.poll()*2;

            if(k<K && pq.isEmpty()) return -1;

            pq.add(k);
            count++;
        }

        return count;
    }
}