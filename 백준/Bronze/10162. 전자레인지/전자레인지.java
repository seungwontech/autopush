import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temp = {300, 60, 10};
        int[] tempCount = {0, 0, 0};
        int time = sc.nextInt();
        for (int i = 0; i < temp.length; i++) {
            tempCount[i] = time / temp[i];
            time = time % temp[i];
        }
        if (time > 0) {
            System.out.println(-1);
        } else {
            for (int count : tempCount) {
                System.out.print(count + " ");
            }
        }
    }
}
