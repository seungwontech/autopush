import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int m = a[i][0];
            int h = a[i][1];
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (m < a[j][0] && h < a[j][1]) {
                        count++;
                    }
                }
            }
            b[i] = count;
        }
        for (int j : b) {
            System.out.print(j + " ");
        }
    }
}
