import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[][] arr;
    static boolean[][] visit;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n+1][n+1];
        visit = new boolean[n+1][n+1];
        for (int i = 0; i < n; i++) {
            String text = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = text.charAt(j);
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
        visit = new boolean[n+1][n+1];
        int n_count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'G'){
                    arr[i][j] = 'R';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visit[i][j]) {
                    dfs(i, j);
                    n_count++;
                }
            }
        }
        System.out.println(n_count);
    }

    public static void dfs(int x, int y) {
        visit[x][y] = true;
        char temp = arr[x][y];
        for (int i = 0; i < 4; i++) {

            int cx = x + dx[i];
            int cy = y + dy[i];
            if(cx < 0 || cy < 0 || cx > n || cy > n) {
                continue;
            }
            if (!visit[cx][cy] && arr[cx][cy] == temp) {
                dfs(cx, cy);
            }

        }
    }
}
