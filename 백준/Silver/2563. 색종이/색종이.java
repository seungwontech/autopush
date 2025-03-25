import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] temp = new int[100][100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int t = 0; t < n; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    temp[i][j] = 1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (temp[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
