import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int rept = Integer.parseInt("1".repeat(str.length()));
        long sum = 0;
        for (char ch : str.toCharArray()) {
            sum += ((ch - '0') * rept);
        }
        System.out.println(sum);
    }
}
