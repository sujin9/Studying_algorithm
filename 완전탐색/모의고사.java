import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] correct = new int[3];
        ArrayList<Integer> best = new ArrayList<>();
        
        int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        for(int i=0; i<answers.length; i++) {
            for(int j=0; j<patterns.length; j++) {
                if(answers[i] == patterns[j][i%patterns[j].length])
                    correct[j]++;
            }
        }
        
        int max = correct[0];
        for(int i=1; i<correct.length; i++) {
            if(correct[i] > max)
                max = correct[i];
        }
        
        for(int i=0; i<correct.length; i++) {
            if(correct[i] == max)
                best.add(i+1);
        }

        return best.stream().mapToInt(i->i).toArray();
    }
}