import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temp = new int[31];
        for (int i = 1; i < 29; i++) {
            int n = sc.nextInt();
            temp[n] = n;
        }
        for (int i = 1; i < temp.length; i++) {
            if(temp[i] == 0){
                System.out.println(i);
            }
        }
    }
}
