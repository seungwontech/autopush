import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i =0; i < t; i++){
            String text = sc.nextLine();
            System.out.println(text.charAt(0) + text.substring(text.length()-1));
        }
    }
}
