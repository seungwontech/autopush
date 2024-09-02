import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int su = Integer.parseInt(st.nextToken());
        int ku = Integer.parseInt(st.nextToken());
        int hu = Integer.parseInt(st.nextToken());

        if (su + ku + hu >= 100) {
            System.out.println("OK");
        } else {
            if(su < ku && su < hu) {
                System.out.println("Soongsil");
            } else if(ku < su && ku < hu) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}
