import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] temp = {1, 1, 2, 2, 2, 8};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int a = sc.nextInt();
            System.out.print(temp[i] - a + " ");
        }
    }
}
