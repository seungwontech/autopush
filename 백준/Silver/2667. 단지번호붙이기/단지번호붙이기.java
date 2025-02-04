import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static char[][] arr;
    static boolean[][] visit;
    static int[] dx = { 0, 0, 1, -1 };
    static int[] dy = { 1, -1, 0, 0 };
    static int n;
    static int apartNum = 0;
    static int[] apart = new int[25 * 25];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        visit = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for(int i =0 ; i < n; i++){
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == '1' && !visit[i][j]) {
                    apartNum++;
                    BFS(i,j);
                }
            }
        }
        Arrays.sort(apart);

        System.out.println(apartNum);
        for (int i = 0; i < apart.length; i++) {
            if(apart[i] == 0) {
            } else {
                System.out.println(apart[i]);
            }

        }
    }

    public static void BFS(int x, int y){
        Queue<int[]> qu = new LinkedList<int[]>();
        qu.add(new int[] { x, y });
        apart[apartNum]++;
        visit[x][y] = true;
        while (!qu.isEmpty()) {
            int curX = qu.peek()[0];
            int curY = qu.peek()[1];
            qu.poll();
            for (int i = 0; i < 4; i++) {
                int cx = curX + dx[i];
                int cy = curY + dy[i];
                if(cx >= 0 && cy >=0 && cx < n && cy < n){
                    if(!visit[cx][cy] && arr[cx][cy] == '1') {
                        qu.add(new int[]{cx, cy});
                        visit[cx][cy] = true;
                        apart[apartNum]++;
                    }
                }
            }
        }
    }
}
