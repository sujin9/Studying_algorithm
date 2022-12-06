import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        int index = 0;
        ArrayList<String> str = new ArrayList<>();
        for(String s:seoul)
            str.add(s);
        
        return "김서방은 "+str.indexOf("Kim")+"에 있다";
    }
}