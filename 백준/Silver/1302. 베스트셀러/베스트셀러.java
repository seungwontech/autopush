import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (map.isEmpty()) {
                map.put(name, 1);
            } else {
                if (map.containsKey(name)) {
                    Integer val = map.get(name) + 1;
                    map.put(name, val);
                } else {
                    map.put(name, 1);
                }
            }
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        int maxValue = Integer.MIN_VALUE;
        String maxKey = null;

        for (String key: keySet) {
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                maxKey = key;
            }
        }
        System.out.println(maxKey);
    }
}