import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] arr;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 정점의 개수 6
        M = sc.nextInt(); // 간선의 개수 5
        arr = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            arr[u][v] = 1;
            arr[v][u] = 1;
        }
        visit = new boolean[N + 1];

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                DFS(i);
                answer++;
            }
        }
        System.out.println(answer);
    }

    private static void DFS(int v) {
        if (visit[v]) {
            return;
        } else {
            visit[v] = true;
            for (int i = 1; i <= N; i++) {
                if (arr[v][i] == 1) {
                    DFS(i);
                }
            }
        }
    }
}
