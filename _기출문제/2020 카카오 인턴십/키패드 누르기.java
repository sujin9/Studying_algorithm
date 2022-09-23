import java.lang.Math;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String handLogo = (hand.equals("left"))?"L":"R";
        int positionLeft = 10;  // *
        int positionRight = 12; // #
        
        for(int i=0; i<numbers.length; i++) {
            int key = numbers[i];
            if(key==0) key = 11;
            
            if(key==1 || key==4 || key==7) {
                answer = useHand(answer, key, positionLeft, "L");
            }
            else if(key==3 || key==6 || key==9) {
                answer = useHand(answer, key, positionRight, "R");
            }
            else {
                int d = getDistance(positionLeft, positionRight, key);
                switch(d) {
                    case -1 :
                        answer = useHand(answer, key, positionLeft, "L");
                        break;
                    case 1:
                        answer = useHand(answer, key, positionRight, "R");
                        break;
                    case 0:
                        if(handLogo.equals("L")) {
                            answer = useHand(answer, key, positionLeft, "L");
                        } else {
                            answer = useHand(answer, key, positionRight, "R");
                        }
                        break;
                }
            }
        }
        
        return answer;
    }
    
    public String useHand(String answer, int k, int pos, String op) {
        pos = k;
        return answer += op;
    }

    public int getDistance(int posL, int posR, int k) {
        int key = k;
        int disFromL = Math.abs(key-posL);
        int disFromR = Math.abs(key-posR);
        
        disFromL = disFromL/3 + disFromL%3;
        disFromR = disFromR/3 + disFromR%3;
        
        if(disFromL<disFromR) return -1;
        else if(disFromL>disFromR) return 1;
        else return 0;
    }
    
}