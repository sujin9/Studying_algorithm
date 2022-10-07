import java.util.*;

class Solution {
    
    static HashSet<Integer> arr = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;

        getNums("", numbers);
        
        for(int i:arr) {
            if(isPrime(i))
                answer++;
        }
        
        return answer;
    }
    
    public void getNums(String num, String others) {
        if(!num.equals(""))
            arr.add(Integer.parseInt(num));
        
        for(int i=0; i<others.length(); i++) {
            getNums(num+others.charAt(i), others.substring(0, i)+others.substring(i+1));
        }
    }
    
    public boolean isPrime(int n) {
        if(n==0 || n==1) return false;
        for(int i=2; i*i<=n; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    
}