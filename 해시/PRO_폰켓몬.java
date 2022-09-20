import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i:nums)
            set.add(i);

        return (set.size()>n)?n:set.size();
    }
}