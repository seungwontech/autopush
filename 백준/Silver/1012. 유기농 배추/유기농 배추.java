import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[][] visit;
    static int m;
    static int n;
    static int k;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int c = 0; c < t; c++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            arr = new int[m][n];
            visit = new boolean[m][n];
            int count = 0;
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a][b] = 1;
            }

            for(int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(arr[i][j] == 1 && !visit[i][j]) {
                        bfs(i,j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void bfs(int x, int y) {
        Queue<int[]> qu = new LinkedList<int[]>();
        qu.add(new int[] { x, y });

        while (!qu.isEmpty()) {
            x = qu.peek()[0];
            y = qu.peek()[1];
            visit[x][y] = true;
            qu.poll();
            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];

                if (cx >= 0 && cy >= 0 && cx < m && cy < n) {
                    if (!visit[cx][cy] && arr[cx][cy] == 1) {
                        qu.add(new int[] { cx, cy });
                        visit[cx][cy] = true;
                    }
                }

            }

        }

    }
}
