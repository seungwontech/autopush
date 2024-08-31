import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            String a = s.nextLine();
            String[] b = a.split("");
            if (a.equals("END"))
                break;

            for (int i = b.length - 1; i >= 0; i--) {
                System.out.print(b[i]);
            }
            System.out.println();
        }
    }
}
