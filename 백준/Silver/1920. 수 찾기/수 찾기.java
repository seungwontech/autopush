import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] tempN = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tempN[i] = Integer.parseInt(st.nextToken());
        }


        int M = Integer.parseInt(br.readLine());
        int[] tempM = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            tempM[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tempN);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (Arrays.binarySearch(tempN, tempM[i]) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}
