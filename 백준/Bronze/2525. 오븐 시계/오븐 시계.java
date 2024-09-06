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

        m += temp;
        if (m > 59) {
            h = (h + m / 60) % 24;
            m = m % 60;
        }
        System.out.println(h + " " + m);
    }
}
