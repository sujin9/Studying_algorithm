import java.util.Stack;

class Solution {
    public String solution(String number, int k) {

        String answer = "";
        Stack<Character> nums = new Stack<>();
        int cnt = 0;
        
        for(char c : number.toCharArray()) {
            while(!nums.isEmpty() && nums.peek()<c && cnt<k) {
                nums.pop();
                cnt++;
            }            
            nums.push(c);
            if(nums.size() > number.length()-k) nums.pop();
        }
        
        while(!nums.isEmpty()) {
            answer = nums.pop() + answer;
        }
        
        return answer;
    }
}