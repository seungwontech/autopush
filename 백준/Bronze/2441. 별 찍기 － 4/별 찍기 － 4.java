import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        char star = '*';
        for (int i = 0; i < n; i++) {
            for (int k = n - i; k < n; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(star);
            }
            System.out.println("");
        }
    }
}