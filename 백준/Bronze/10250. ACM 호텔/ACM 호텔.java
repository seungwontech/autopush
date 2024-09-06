import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W= Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int Y = N%H;
            int X = N/H;
            if(Y == 0) {
                if ( X < 10) {
                    System.out.println(H+"0"+X);
                } else {
                    System.out.println(H+""+X);
                }
            } else {
                X++;
                if ( X < 10) {
                    System.out.println(Y+"0"+X);
                } else {
                    System.out.println(Y+""+X);
                }
            }
        }
    }
}
