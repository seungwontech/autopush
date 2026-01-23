import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            long K = Long.parseLong(st.nextToken());

            long[] money = new long[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                money[j] = Long.parseLong(st.nextToken());
            }

            int ans = slove(N, M, K, money);
            out.append(ans).append("\n");
        }

        System.out.println(out);
    }

    private static int slove(int n, int m, long k, long[] money) {
        if (m == n) {
            long total = 0;
            for (int i = 0; i < money.length; i++) {
                total += money[i];
            }
            return (total < k) ? 1 : 0;
        }

        long windowSum = 0;
        for (int i = 0; i < m; i++) {
            windowSum += money[i];
        }
        int count = 0;
        if (windowSum < k){
            count++;
        }

        for (int i = 1; i < n; i++) {
            windowSum -= money[i - 1];
            int inIdx = (i + m - 1) % n;
            windowSum += money[inIdx];

            if(windowSum < k) {
                count++;
            }
        }

        return count;
    }

}
