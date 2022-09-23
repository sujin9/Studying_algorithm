import java.util.*;

class Solution {
    public int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i=0; i<numbers.length; i++) {
            s = s.replaceAll(numbers[i], digits[i]);
        }
        
        return Integer.parseInt(s);
    }
}