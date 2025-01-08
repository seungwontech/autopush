import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            int[] temp = new int[t + 1];
            for (int j = 0; j < t; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                temp[a] = b;
            }
            int count = 1;
            int k = temp[1];
            for (int j = 2; j < temp.length; j++) {
                if (k > temp[j]) {
                    count++;
                    k = temp[j];
                }
            }
            result[i] = count;
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}
