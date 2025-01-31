import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, V;
    static int[][] arr;
    static boolean[] visit;
    static StringBuilder text = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][N + 1];
        visit = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        DFS(V);
        text.append("\n");
        visit = new boolean[N + 1];
        BFS(V);
        System.out.println(text);
    }

    private static void DFS(int v) {
        visit[v] = true;
        text.append(v + " ");
        for (int i = 0; i <= N; i++) {
            if (arr[v][i] == 1 && !visit[i]) {
                DFS(i);
            }
        }
    }

    private static void BFS(int v) {
        q.add(v);
        visit[v] = true;
        while (!q.isEmpty()) {
            v = q.poll();
            text.append(v + " ");
            for(int i = 1; i <= N; i++) {
                if(arr[v][i] == 1 && !visit[i]) {
                    q.add(i);
                    visit[i] = true;
                }
            }
        }
    }
}
