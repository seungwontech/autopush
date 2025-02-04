import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] temp = new int[10001];
        for (int i = 0; i < n; i++) {
            temp[Integer.parseInt(br.readLine())]++;
        }
        for(int i = 0; i < 10001; i++) {
            while(temp[i] > 0) {
                sb.append(i).append("\n");
                temp[i]--;
            }
        }
        System.out.println(sb);
    }
}
