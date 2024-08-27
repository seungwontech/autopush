import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = 1;
        while (k * k < n) {
            k++;
        }
        for (int i = 0; i < k + 2; i++) {
            System.out.print("x");
        }
        System.out.println();
        for (int i = 0; i < k; i++) {
            System.out.print("x");
            for (int j = 0; j < k; j++) {
                System.out.print(".");
            }
            System.out.println("x");
        }
        for (int i = 0; i < k + 2; i++) {
            System.out.print("x");
        }

    }
}
