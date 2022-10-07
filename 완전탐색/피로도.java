import java.util.*;
import java.lang.Math;

class Solution {
    boolean[] visited;
    int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        return search(0, k, dungeons);
    }
    
    public int search(int d, int k, int[][] dungeons) {
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0]<=k) {
                visited[i] = true;
                search(d+1, k-dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        answer = Math.max(answer,d);
        return answer;
    }
    
}