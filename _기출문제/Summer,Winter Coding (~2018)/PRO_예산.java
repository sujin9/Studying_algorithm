import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = d.length;
        ArrayList<Integer> budgets = new ArrayList<>();
        int sumBudget = 0;
        
        for(int i:d) {
            budgets.add(i);
            sumBudget += i;
        }
        
        budgets.sort(Collections.reverseOrder());
        
        while(sumBudget>budget) {
            sumBudget -= budgets.get(0);
            budgets.remove(0);
            answer--;
        }
        
        return answer;
    }
}