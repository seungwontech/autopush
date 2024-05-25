import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));

        String val = brf.readLine().toString();
        System.out.println(val.length());

        brf.close();

    }
}
