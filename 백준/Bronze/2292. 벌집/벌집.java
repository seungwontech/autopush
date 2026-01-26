import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int end;
        int k = 1;
        int count = 1;
        while (true) {
            end = 6 * (k - 1);
            count += end;
            if (N <= count) {
                break;
            }
            k++;
        }
        System.out.println(k);
    }
}
