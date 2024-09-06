import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int temp = Integer.parseInt(br.readLine());

        if (temp / 60 > 0) {
            h += temp / 60;
            m += temp % 60;
        } else {
            m += temp % 60;
        }

        if (m > 59) {
            m = m%60;
            h++;
        }
        if (h > 23) {
            h = h%24;
        }
        System.out.println(h + " " + m);
    }
}
