import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] text = br.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < text.length; i++) {
            String temp = String.valueOf(text[i]);
            if (!temp.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
