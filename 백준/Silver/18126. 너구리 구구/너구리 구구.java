import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<ArrayList<Edge>> tree;
    static long maxDistance; // 최대 거리

    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static void dfs(int node, int parent, long distance){
        boolean isLeaf = true;

        for (Edge edge : tree.get(node)) {
            if (edge.to != parent){
                isLeaf = false;
                dfs(edge.to, node, distance + edge.weight);
            }
        }
        if (isLeaf){
            maxDistance = Math.max(maxDistance, distance);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(brf.readLine());
        // brf.close();

        tree = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++){
            tree.add(new ArrayList<>());
        }
        
        for (int i = 0; i < n-1; i++){
            String[] input = brf.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);// 가중치
            tree.get(u).add(new Edge(v, weight));
            tree.get(v).add(new Edge(u, weight));
        }
        maxDistance = 0;
        dfs(1, -1,0);
        System.out.println(maxDistance);
    }
}
