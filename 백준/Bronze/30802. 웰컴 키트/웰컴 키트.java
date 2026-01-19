import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] sizes = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int resultT = 0;
        int resultP = 0;
        int resultTemp = 0;
        for (int i = 0; i < sizes.length; i++) {
            resultT += sizes[i] / T;
            if(sizes[i] % T > 0) {
                resultT += 1;
            }
        }

        resultP = N/P;
        resultTemp = N%P;

        System.out.println(resultT);
        System.out.println(resultP + " " + resultTemp);

    }
}
