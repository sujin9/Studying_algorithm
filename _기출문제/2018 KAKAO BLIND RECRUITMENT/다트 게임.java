import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        int scoreBefore = 0;    // 직전에 획득한 점수
        int score = 0;          // 지금 획득한 점수
        
        for(int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if(c>='0' && c<='9') {
                if(i!=0 && dartResult.charAt(i-1)=='1') {   // 숫자가 두자리수일 경우
                    score = 10 + c -'0';
                    continue;
                }
                
                answer += score;
                scoreBefore = score;
                score = c - '0';
            }
            
            else {
                switch(c) {
                    // case S: 1제곱이므로 변화 없음
                    case 'D':
                        score = (int)Math.pow(score, 2);
                        break;
                    case 'T':
                        score = (int)Math.pow(score, 3);
                        break;
                        
                    case '*':
                        score *= 2;
                        answer += scoreBefore;  // 이전 점수도 2배가 되는데, 이미 원점수는 answer에 포함되어 있음.
                        break;
                    case '#':
                        score *= -1;
                        break;
                }
            }
        }
        
        answer += score;    // 마지막 점수
        
        return answer;
    }
}