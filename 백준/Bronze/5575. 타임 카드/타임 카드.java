import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ah = Integer.parseInt(st.nextToken());
            int am = Integer.parseInt(st.nextToken());
            int as = Integer.parseInt(st.nextToken());
            int bh = Integer.parseInt(st.nextToken());
            int bm = Integer.parseInt(st.nextToken());
            int bs = Integer.parseInt(st.nextToken());
            if (as > bs) {
                bs += 60;
                bm--;
            }
            bs -= as;

            if (am > bm) {
                bm += 60;
                bh--;
            }
            bm -= am;

            bh -= ah;
            System.out.println(bh + " " + bm + " " + bs);
        }
    }
}
