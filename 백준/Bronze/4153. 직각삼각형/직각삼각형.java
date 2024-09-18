import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            boolean result = false;
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (b < a && c < a) {
                if (a * a == b * b + c * c) result = true;
            } else if (a < b && c < b) {
                if (b * b == a * a + c * c) result = true;
            } else {
                if (c * c == a * a + b * b) result = true;
            }
            if (result) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
