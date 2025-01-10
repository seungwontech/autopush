import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.next().toCharArray();
        int[] temp = new int[26];
        Arrays.fill(temp, -1);

        for (int i = 0; i < text.length; i++) {
            if(temp[text[i]-'a'] < 0 ) {
                temp[text[i]-'a'] = i;
            }
        }
        for (int j : temp) {
            System.out.print(j + " ");
        }
    }
}
