import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> triple = new ArrayList<>();
        
        while(n>0) {
            triple.add(0, n%3);
            n /= 3;
        }
        
        for(int i=0; i<triple.size(); i++) {
            answer += (triple.get(i) * Math.pow(3, i));
        }
        
        return answer;
    }
}