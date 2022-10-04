import java.lang.Math;

class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for (int[] size : sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);

            if (max > w) {
                w = max;
            }

            if (min > h) {
                h = min;
            }
        }
        return w * h;
    }
}