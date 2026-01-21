import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> buckets = new HashMap<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            buckets.put(x, g);
        }
        List<Integer> keySet = new ArrayList<>(buckets.keySet());
        Collections.sort(keySet);
        int sum = 0;
        int start = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            sum += buckets.get(keySet.get(i));
            while(keySet.get(i) - keySet.get(start) > 2 * K) {
                sum -= buckets.get(keySet.get(start));
                start++;
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);

    }
}
