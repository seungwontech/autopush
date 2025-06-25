import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            char[] arr = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<Character>();
            boolean flag = false;
            for (char c : arr) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        System.out.println("NO");
                        flag = true;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(!flag){
                if (stack.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
