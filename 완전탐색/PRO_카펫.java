class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int n=yellow; n>0; n--) {
            if(n==0) break;
            if(yellow%n!=0) continue;
            
            int b = 0;
            b = getBrownNum(n, yellow/n);
            
            if(b==brown) {
                answer[0] = n + 2;
                answer[1] = yellow/n + 2;
                break;
            }
        }
        
        return answer;
    }
    
    public int getBrownNum(int r, int c) {
        return (r+1)*2 + (c+1)*2;
    }
}