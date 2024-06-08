import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] number = br.readLine().split(" ");
        int a = Integer.parseInt(number[0]);
        int b = Integer.parseInt(number[1]);
        int c = Integer.parseInt(number[2]);
        int result = 0;
        result = a * b - c;
        System.out.println(result < 0 ? 0 : result);
    }
}