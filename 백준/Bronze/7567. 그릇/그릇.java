import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] arrA = st.nextToken().split("");
        int rtnVal = 10;
        String temp = arrA[0];
        for (int i = 1; i < arrA.length; i++) {
            if (arrA[i].equals(temp)) {
                rtnVal += 5;
            } else {
                rtnVal += 10;
                temp = arrA[i];
            }
        }
        System.out.println(rtnVal);
    }
}
