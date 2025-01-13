import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄: 보석의 개수 N과 가방의 개수 K
        int N = sc.nextInt();
        int K = sc.nextInt();

        // 보석 정보 입력 (무게, 가격)
        int[][] jewels = new int[N][2]; // jewels[i][0] = 무게, jewels[i][1] = 가격
        for (int i = 0; i < N; i++) {
            jewels[i][0] = sc.nextInt(); // 보석의 무게
            jewels[i][1] = sc.nextInt(); // 보석의 가격
        }

        // 가방의 최대 무게 입력
        int[] bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = sc.nextInt(); // 가방의 최대 무게
        }

        Arrays.sort(jewels, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o2[1] - o1[1];
                }
                return o1[0] - o2[0];
            }
        });

        Arrays.sort(bags);

        long totalPrice = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // 가격 내림차순으로 변경
        int jewelIndex = 0;
        for (int i = 0; i < K; i++) {
            while (jewelIndex < N && jewels[jewelIndex][0] <= bags[i]) {
                pq.add(jewels[jewelIndex][1]);
                jewelIndex++;
            }
            if (!pq.isEmpty()) {
                totalPrice += pq.poll();
            }
        }
        System.out.println(totalPrice);
    }
}
