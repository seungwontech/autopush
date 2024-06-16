import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        String answer = "";
        String[] temp = new String[3];
        temp[0] = a;
        temp[1] = b;
        temp[2] = c;
        int val = 0;
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].equals("FizzBuzz") && !temp[i].equals("Fizz") && !temp[i].equals("Buzz")) {
                index = 3 - i;
                val = Integer.parseInt(temp[i]) + index;
                break;
            }
        }
        if (val % 3 == 0 && val % 5 == 0) {
            answer = "FizzBuzz";
        } else if (val % 3 == 0) {
            answer = "Fizz";
        } else if (val % 5 == 0) {
            answer = "Buzz";
        } else {
            answer = String.valueOf(val);
        }

        System.out.println(answer);
    }
}