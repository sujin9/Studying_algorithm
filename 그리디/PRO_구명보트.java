import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int len = people.length;
        Arrays.sort(people);
        
        int extra = 0;
        int i = 0;
        int j = len - 1;
        
        while(i<=j) {
            
            // 앞선 배에 더 탈 수 있는 경우
            if(people[i] <= extra) {
                extra -= people[i];
                i++;
                continue;
            }
            
            extra = 0;
            // 배에 두 명이 함께 타는 경우
            if(people[i] + people[j] <= limit) {
                answer++;
                extra = limit - (people[i] + people[j]);
                i++;
                j--;
                continue;
            }
            
            // 배에 혼자 타야하는 경우
            else {
                j--;
                answer++;
            }
        }
        
        return answer;
    }
}