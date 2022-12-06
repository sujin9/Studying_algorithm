class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long fee = 0;
        for(int i=1; i<=count; i++) {
            fee += price * i;
        }

        return (fee - money>0)?fee-money:0;
    }
}