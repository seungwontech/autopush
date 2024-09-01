import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstLine = br.readLine().split(" ");
        int a = Integer.parseInt(firstLine[0]);
        int b = Integer.parseInt(firstLine[1]);

        String[] secondLine = br.readLine().split(" ");
        int c = Integer.parseInt(secondLine[0]);
        int d = Integer.parseInt(secondLine[1]);

        System.out.println(Math.min(a + d, b + c));
    }
}
