import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> dolls = new Stack<Integer>();
        
        for(int i:moves) {
            int idxOfDoll = getDolls(board, i);
            if(idxOfDoll==-1) continue; // 세로 라인에 인형이 없는 경우
            
            if(!dolls.empty() && board[idxOfDoll][i-1] == dolls.peek()) {
                answer += 2;
                dolls.pop();
            }
            else
                dolls.add(board[idxOfDoll][i-1]);
            
            board[idxOfDoll][i-1] = 0;
    
        }
    
        System.out.println(Arrays.toString(dolls.toArray()));
        
        return answer;
    }
    
    // 해당 위치에서 맨 위에 있는 인형
    public int getDolls(int[][] board, int m) {
        for(int i=0; i<board.length; i++) {
            if(board[i][m-1] == 0) continue;
            else return i;
        }
        return -1;
    }
}