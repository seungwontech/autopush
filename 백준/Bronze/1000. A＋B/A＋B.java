import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        String[] nmSplitArr = brf.readLine().split(" ");

        int n = Integer.parseInt(nmSplitArr[0]);
        int m = Integer.parseInt(nmSplitArr[1]);

        System.out.println(n + m);
    }
}