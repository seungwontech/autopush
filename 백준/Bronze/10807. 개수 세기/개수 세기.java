import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            temp[i] = a;
        }
        int v = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < temp.length; i++) {
            if (v == temp[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
