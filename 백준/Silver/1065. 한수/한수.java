import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int A100 = 0;
        int A10 = 0;
        int A1 = 0;
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                count++;
            } else {
                A100 = i / 100;
                A10 = (i % 100) / 10;
                A1 = i % 10;

                if ((A100 - A10) == (A10 - A1)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


}
