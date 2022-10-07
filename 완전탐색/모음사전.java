class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] values = {781, 156, 31, 6, 1};
        String[] words = word.split("");
        
        for(int i=0; i<words.length; i++) {
            answer += getIndex(words[i])*values[i];
        }
        
        return answer + words.length;
    }
    
    public int getIndex(String s) {
        switch(s) {
            case "A":
                return 0;
            case "E":
                return 1;
            case "I":
                return 2;
            case "O":
                return 3;
            case "U":
                return 4;
        }
        return -1;
    }
}