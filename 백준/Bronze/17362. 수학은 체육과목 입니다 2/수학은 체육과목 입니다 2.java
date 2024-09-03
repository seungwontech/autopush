import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n%8;
        if(temp==1) {
            System.out.println("1");
        } else if(temp == 2 || temp == 0){
            System.out.println("2");
        } else if(temp == 3 || temp == 7) {
            System.out.println("3");
        } else if(temp == 4 || temp == 6) {
            System.out.println("4");
        } else if(temp == 5) {
            System.out.println("5");
        }
    }
}
