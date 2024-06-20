import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String str = "";
        for (int i = 0; i < a / 4; i++) {
            str += "long ";
        }
        System.out.println(str + "int");
    }
}
