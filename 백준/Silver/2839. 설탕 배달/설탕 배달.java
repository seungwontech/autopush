import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = -1;
        for(int i=N/5; i >=0; i--) {
            int remaining = N - (i*5);
            if(remaining%3==0) {
                result = i + remaining/3;
                break;
            }
        }
        System.out.println(result);
    }
}
