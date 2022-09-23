class Solution {
    public String solution(String new_id) {
        
        //1
        new_id = new_id.toLowerCase();
        
        StringBuffer answer = new StringBuffer(new_id);

        //2
        for(int i=0; i<answer.length(); i++) {
            char c = answer.charAt(i);

            if(!((c>='a'&&c<='z')||(c>='0'&&c<='9')||c=='.'||c=='_'||c=='-'))
                 answer.deleteCharAt(i--);
        }
        
        //3
        for(int i=0; i<answer.length(); i++) {
           char c = answer.charAt(i);

           if(c=='.' && i!=answer.length()-1 && answer.charAt(i+1)=='.')
                   answer.deleteCharAt(i--);
        }
        
        //4
        if(answer.charAt(0) == '.')
            answer.deleteCharAt(0);
        if(answer.length()>1 && answer.charAt(answer.length()-1) == '.')
            answer.deleteCharAt(answer.length()-1);
        
        //5
        if(answer.length()==0) {
            answer.append("a");
        }
        
        //6
        if(answer.length()>15) {
            answer.delete(15, answer.length());
        }
        
        char c = answer.charAt(answer.length()-1);
        
        if(c=='.')
            answer.deleteCharAt(answer.length()-1);
        
        //7
        while(answer.length()<=2) {
            answer.append(c);
        }
        
       
        return answer.toString();
    }
}