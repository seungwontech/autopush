import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max_val = Integer.MIN_VALUE;
        int min_val = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (max_val < a) {
                max_val = a;
            }
            if (min_val > a) {
                min_val = a;
            }
        }
        System.out.println(min_val + " " + max_val);
    }
}
