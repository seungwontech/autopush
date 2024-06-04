import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            if (map.containsKey(clothes[i][1])) {
                int cnt = map.get(clothes[i][1]) + 1;
                map.put(clothes[i][1], cnt);
            } else {
                map.put(clothes[i][1], 1);  
            }
        }
        System.out.println(map);
        for (String key : map.keySet()) {
            answer *= map.get(key) + 1;
        }
        answer -= 1;
        return answer;
    }
}