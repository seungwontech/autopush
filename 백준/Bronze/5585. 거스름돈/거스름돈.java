import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {500, 100, 50, 10, 5, 1};
        int temp = 1000 - sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += temp/arr[i];
            temp = temp%arr[i];
        }
        System.out.println(count);
    }
}
