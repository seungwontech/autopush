import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(temp);
        for(int i : temp) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
