import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 1;
        while (A != B) {
            if(A > B) {
                count = -1;
                break;
            }
            if (B % 10 == 1) {
                B = B / 10;
            } else if (B % 2 == 0) {
                B = B / 2;
            } else {
                count = -1;
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
