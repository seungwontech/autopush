import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] is_prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        sieveOfEratosthenes(N);

        StringBuffer sb = new StringBuffer();
        for (int i = M; i <= N; i++) {
            if(is_prime[i]){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static void sieveOfEratosthenes(int n) {
        is_prime = new boolean[n + 1];
        for(int i=0; i<=n; i++) {
            is_prime[i] = true;
        }

        is_prime[0] = false;
        is_prime[1] = false;

        for(int i= 2; i * i <= n; i++) {
            if(is_prime[i]) {
                for(int j=i*i; j<=n; j+=i) {
                    is_prime[j] = false;
                }
            }
        }
    }
}
