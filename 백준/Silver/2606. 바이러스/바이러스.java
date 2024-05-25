import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static List[] computers;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(brf.readLine()); // 컴퓨터 수
        int connections = Integer.parseInt(brf.readLine()); // 연결된 정보

        visited = new boolean[n + 1];
        computers = new List[n + 1];

        for (int i = 1; i < n + 1; i++){
            computers[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < connections; i++){
            String[] input = brf.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            computers[a].add(b);
            computers[b].add(a);
        }
        System.out.println(bfs(1));
    }
    private static int bfs(int start){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        int count = 0;
        while(!queue.isEmpty()){
            int now = queue.poll(); // 대기열 1씩 줄어든다.
            if (!visited[now]){
                count++;
                visited[now] = true;
                for (int i = 0; i < computers[now].size(); i++){
                    queue.add((int)computers[now].get(i));
                }
            }
        }
        return count - 1;
    }
}
