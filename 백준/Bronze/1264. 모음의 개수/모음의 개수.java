import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            String a = s.nextLine().toLowerCase();
            String[] b = a.split("");
            int count;

            count = 0;

            if (a.equals("#"))
                break;

            for (int i = 0; i < b.length; i++) {
                if (b[i].equals("a") || b[i].equals("e") || b[i].equals("i") || b[i].equals("o") || b[i].equals("u"))
                    count++;
            }

            System.out.println(count);

        }
    }
}
