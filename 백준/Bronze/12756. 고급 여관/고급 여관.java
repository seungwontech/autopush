import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tempA = br.readLine().split(" ");
        String[] tempB = br.readLine().split(" ");

        int aHp = Integer.parseInt(tempA[1]);
        int bHp = Integer.parseInt(tempB[1]);
        while (true) {
            aHp -= Integer.parseInt(tempB[0]);
            bHp -= Integer.parseInt(tempA[0]);

            if (aHp >= 1 && bHp <= 0) {
                System.out.println("PLAYER A");
                break;
            } else if (bHp >= 1 && aHp <= 0) {
                System.out.println("PLAYER B");
                break;
            } else if (bHp > 0 && aHp > 0) {
                continue;
            } else {
                System.out.println("DRAW");
                break;
            }
        }
    }
}
