import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 이동을 위한 방향 배열
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        String[] nmSplitArr = brf.readLine().split(" ");

        int n = Integer.parseInt(nmSplitArr[0]);
        int m = Integer.parseInt(nmSplitArr[1]);

        int[][] maze = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] line = brf.readLine().split("");
            for (int j = 0; j < m; j++) {
                maze[i][j] = Integer.parseInt(line[j]);
            }
        }
        int result = bfs(maze, n, m);
        System.out.println(result);

    }

    private static int bfs(int[][] maze, int n, int m) {
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            if (x == n - 1 && y == m - 1) {
                return distance;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maze[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny, distance + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }
}
