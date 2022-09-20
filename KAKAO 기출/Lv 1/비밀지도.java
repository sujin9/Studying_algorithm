class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0; i<n; i++) {
            answer[i] = getValue(n, arr1[i], arr2[i]);
        }

        return answer;
    }

    String getValue(int n, int v1, int v2) {
        String line = "";
        int v = v1 | v2;

        for(int i=n-1; i>=0; i--) {
            line += ((v & (1 << i)) > 0)? "#" : " ";
        }
        return line;
    }
}