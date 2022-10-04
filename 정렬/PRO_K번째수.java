import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int k=0;
        
        for(int[] c:commands) {
            int[] a = new int[c[1]-c[0]+1];
            for(int i=c[0]-1; i<c[1]; i++) {
                a[i-c[0]+1] = array[i];
            }
            Arrays.sort(a);
            answer[k++] = a[c[2]-1];
        }
        
        return answer;
    }
}