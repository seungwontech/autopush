import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String answer = "";
        if (a + b + c != 180) {
            answer = "Error";
        } else {
            if (a == 60 && b == 60 && c == 60) {
                answer = "Equilateral";
            } else if( a == b || b == c || a == c){
                answer = "Isosceles";
            } else {
                answer = "Scalene";
            }
        }
        System.out.println(answer);
    }
}