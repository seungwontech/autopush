import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] abc = new int[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();
        for (int i = 0; i < text.length; i++) {
            int n = text[i];
            abc[n-97]++;
        }
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + " ");
        }
    }
}
