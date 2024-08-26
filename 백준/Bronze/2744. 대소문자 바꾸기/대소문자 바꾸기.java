import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.next().toCharArray();
        for (int i = 0; i < text.length; i++) {
            char temp = text[i];
            if (temp >= 'a' && temp <= 'z') {
                System.out.print((char) (temp - 32));
            } else {
                System.out.print((char) (temp + 32));
            }
        }
    }
}
