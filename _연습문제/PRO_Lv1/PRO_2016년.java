class Solution {
    public String solution(int a, int b) {
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int d = b - 1;
        for(int i=0; i<a-1; i++)
            d += daysOfMonth[i];

        d %= 7;
        return days[d];
    }
}