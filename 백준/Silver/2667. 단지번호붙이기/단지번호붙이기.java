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
                    DFS(i,j);
                }
            }
        }
        Arrays.sort(apart, 1, apartNum + 1);

        System.out.println(apartNum);
        for (int i = 1; i <= apartNum; i++) {
            System.out.println(apart[i]);
        }
    }

    public static void DFS(int x, int y){
        apart[apartNum]++;
        visit[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            if(cx >= 0 && cy >= 0 && cx < n && cy <n){
                if(arr[cx][cy] == '1' && !visit[cx][cy]){
                    DFS(cx, cy);
                }
            }
        }
    }
}
