import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine()); // 방학 총 일
        double A = Integer.parseInt(br.readLine()); // 국어 총 페이지
        double B = Integer.parseInt(br.readLine()); // 수학 총 페이지
        double C = Integer.parseInt(br.readLine()); // 국어 최대 페이지
        double D = Integer.parseInt(br.readLine()); // 수학 초대 페이지
        double aMax = Math.ceil(A/C);
        double bMax = Math.ceil(B/D);
        int max = (int) Math.max(aMax,bMax);
        System.out.println(L - max);
    }
}
