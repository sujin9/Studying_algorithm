import java.util.*;

class Solution {
    
    boolean[] lostList;
    boolean[] reserveList;
    
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        lostList = new boolean[n];
        reserveList = new boolean[n];

        for(int i:lost) {
            lostList[i-1] = true;
        }
        for(int i:reserve) {
            reserveList[i-1] = true;
        }
        
        for(int i=0; i<n; i++) {
            if(lostList[i] && reserveList[i]) {
                lostList[i] = false;
                reserveList[i] = false;
            }
        }
        
        for(int i=0; i<n; i++) {
            if(!lostList[i])
                answer++;
            else if(lostList[i] && checkCanBorrow(i))
                answer++;
        }
        
        return answer;
    }
    
    public boolean checkCanBorrow(int n) {
        if(n-1>=0 && reserveList[n-1]) {
            reserveList[n-1] = false;
            return true;
        }
        if(n+1<reserveList.length && reserveList[n+1]) {
            reserveList[n+1] = false;
            return true;
        }
        return false;
    }
    
    
    
}