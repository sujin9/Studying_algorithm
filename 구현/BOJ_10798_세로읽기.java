import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] words = new char[5][15];
        int maxLen = 0;

        for(int i=0; i<5; i++) {
            words[i] = br.readLine().toCharArray();
            maxLen = Math.max(maxLen, words[i].length);
        }

        String answer = "";

        for(int i=0; i<maxLen; i++) {
            for(int j=0; j<5; j++) {
                if(words[j].length > i) answer += words[j][i];
            }
        }

        bw.write(answer+'\n');

        bw.flush();
        bw.close();
        br.close();
    }
}
