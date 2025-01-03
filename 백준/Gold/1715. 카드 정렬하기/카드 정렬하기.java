import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextLong());
        }
        long count = 0;
        while (pq.size() > 1) {
            long a = pq.poll();
            long b = pq.poll();
            count += a + b;
            pq.add(a + b);
        }
        System.out.println(count);
    }
}
