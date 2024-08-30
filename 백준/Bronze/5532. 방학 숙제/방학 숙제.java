import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine()); // 국어
        int B = Integer.parseInt(br.readLine()); // 수학
        int C = Integer.parseInt(br.readLine()); // 국어 최대
        int D = Integer.parseInt(br.readLine()); // 수학 최대
        int bd = B/D;
        int ac = A/C;
        if (B%D != 0) {
            bd++;
        }
        if(A%C != 0) {
            ac++;
        }
        if(bd < ac) {
            System.out.println(L-ac);
        } else {
            System.out.println(L-bd);
        }
    }
}
