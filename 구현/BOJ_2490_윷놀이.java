import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int cnt;
        for(int i=0; i<3; i++) {
            cnt = 0;    // 배(0)의 개수
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<4; j++) {
                String yut = st.nextToken();
                if(yut.equals("0")) cnt++;
            }

            switch(cnt) {
                case 1:
                    bw.write("A\n");
                    break;
                case 2:
                    bw.write("B\n");
                    break;
                case 3:
                    bw.write("C\n");
                    break;
                case 4:
                    bw.write("D\n");
                    break;
                case 0:
                    bw.write("E\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
