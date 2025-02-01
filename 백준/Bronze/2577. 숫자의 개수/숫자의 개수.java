
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        char[] temp = String.valueOf(a * b * c).toCharArray();
        for (char value : temp) {
            arr[value - 48] += 1;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
