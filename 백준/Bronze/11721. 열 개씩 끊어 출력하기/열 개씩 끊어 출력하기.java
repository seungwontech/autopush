import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        for (int i = 0; i < text.length(); i = i + 10) {
            String temp;
            if (i + 10 < text.length()) {
                temp = text.substring(i, i + 10);
            } else {
                temp = text.substring(i, text.length());
            }
            System.out.println(temp);
        }
    }
}
