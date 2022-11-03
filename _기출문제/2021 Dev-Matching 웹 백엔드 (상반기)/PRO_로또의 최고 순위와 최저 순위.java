import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int countOfMatchNumber = 0;
        int countOfZero = 0;
        
        for(int num:lottos) {
            if(IntStream.of(win_nums).anyMatch(i->i==num))
                countOfMatchNumber++;
            else if(num==0)
                countOfZero++;
        }
        
        answer[0] = 7-countOfMatchNumber-countOfZero;
        answer[1] = 7-countOfMatchNumber;
        
        for(int i=0;i<answer.length;i++)
            if(answer[i]>6) answer[i]=6;
        
        return answer;
    }
}