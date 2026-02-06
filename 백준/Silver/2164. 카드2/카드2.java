import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> qu = new LinkedList<>();


        for (int i = 1; i <= N; i++) {
            qu.add(i);
        }
        int count = 1;
        while (qu.size() > 1) {
            if (count % 2 == 1) {
                qu.poll();
            } else {
                qu.add(qu.poll());
            }
            count++;
        }
        System.out.println(qu.peek());
    }

}
