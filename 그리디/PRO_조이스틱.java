class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int move = len - 1;     // 한 방향으로 쭉 가는 경우
        
        for(int i=0; i<len; i++) {
            char c = name.charAt(i);
            answer += Math.min(Character.valueOf(c) - 'A', 'Z'-Character.valueOf(c)+1);
            
            int index = i+1;
            while(index<len && name.charAt(index)=='A') {
                index++;
            }
            
            move = Math.min(move, i*2 +len - index);    // -> <- <-
            move = Math.min(move, (len-index)*2 + i);    // <- -> ->
            
        }
        
        return answer + move;
    }
}