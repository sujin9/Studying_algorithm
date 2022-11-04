class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean isExist;
        
        for(int i=0; i<10; i++) {
            isExist = false;
            for(int j:numbers) {
                if(i==j) {
                    isExist = true;
                    break;
                }
            }
            if(!isExist)
                answer += i;
        }
        
        return answer;
    }
}