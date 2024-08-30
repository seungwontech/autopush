import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sts = new StringTokenizer(br.readLine());
        StringTokenizer stt = new StringTokenizer(br.readLine());
        int s_sum = 0;
        int t_sum = 0;
        for (int i = 0; i < 4; i++) {
            int s = Integer.parseInt(sts.nextToken());
            int t = Integer.parseInt(stt.nextToken());
            s_sum+=s;
            t_sum+=t;
        }
        if (s_sum >= t_sum) {
            System.out.println(s_sum);
        } else {
            System.out.println(t_sum);
        }
    }
}
