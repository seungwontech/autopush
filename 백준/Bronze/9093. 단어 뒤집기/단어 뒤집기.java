import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                StringBuilder sb1 = new StringBuilder(st.nextToken());
                sb.append(sb1.reverse() + " ");
            }
            sb.setLength(sb.length() - 1);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}