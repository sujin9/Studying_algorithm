class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        while(true) {
            
            if(a%2==0&&a-1==b) break;
            if(b%2==0&&b-1==a) break;
            
            if(a%2==0) a = a/2;
            else a = (a+1)/2;
            
            if(b%2==0) b = b/2;
            else b = (b+1)/2;

            answer++;
        }
        
        
        return answer;
    }
}