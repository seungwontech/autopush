import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String check1 = "dz=";
        String[] check2 = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String text = sc.next();
        int count = 0;
        for (int i = 0; i < text.length() - 1; ) {

            if (i < text.length() - 2 && check1.equals(text.substring(i, i + 3))) {
                count += 2;
                i += 3;
            } else {
                boolean match = false;
                String now = text.substring(i, i + 2);
                for (int j = 0; j < check2.length; j++) {
                    String s = check2[j];
                    if (s.equals(now)) {
                        count++;
                        i += 2;
                        match = true;
                        break;
                    }
                }
                if (!match) {
                    i++;
                }
            }
        }
        System.out.println(text.length() - count);
    }
}