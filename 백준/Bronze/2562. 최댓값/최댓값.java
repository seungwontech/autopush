import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max_val = Integer.MIN_VALUE;
        int temp = 0;
        for(int i = 0; i < 9; i++){
            int a = Integer.parseInt(br.readLine());
            if (max_val < a) {
                max_val = a;
                temp = i + 1;
            }
        }
        System.out.println(max_val);
        System.out.println(temp);
    }
}
