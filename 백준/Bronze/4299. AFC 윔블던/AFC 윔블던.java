import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b > a) {
            System.out.println("-1");
        } else {
            int x = (a + b) / 2;
            int y = (a - b) / 2;
            if (x + y == a && x - y == b) {
                System.out.println(x + " " + y);
            } else {
                System.out.println("-1");
            }
        }
    }
}
