import java.util.*;

class FailRate {
    int index;
    double rate;
    
    FailRate(int index, double rate) {
        this.index = index;
        this.rate = rate;
    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int users = stages.length;
        ArrayList<FailRate> failRates = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            int n=0;
            for(int j:stages) {
                if(i+1 == j)
                    n++;
            }
            
            double rate;
            if(n==0) rate = 0.0;
            else rate = (double)n / users;
            users -= n;
            
            failRates.add(new FailRate(i+1, rate));
        }
        
        Collections.sort(failRates, ((r1, r2)->Double.compare(r2.rate, r1.rate)));
        
        for(int i=0; i<failRates.size(); i++)
            answer[i] = failRates.get(i).index;
        
        return answer;
    }
}