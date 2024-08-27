import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int x = Integer.parseInt(br.readLine()); // 총금액
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 금액
            int b = Integer.parseInt(st.nextToken()); // 개수
            x -= a * b;
        }
        if (x == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
