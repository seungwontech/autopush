import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i =0; i< want.length; i++) {
            map.put(want[i], number[i]);
        }
        for(int i=0; i<= discount.length - 10; i++) {
            HashMap<String, Integer> copyMap = new HashMap<>();
            copyMap.putAll(map);
            for(int j = i; j <i + 10; j++) {
                String key = discount[j];
                if(copyMap.containsKey(key)) {
                    if(copyMap.get(key) - 1 == 0) {
                        copyMap.remove(key);
                    } else {
                        copyMap.put(key, copyMap.get(key) - 1);
                    }
                }

            }  
            if(copyMap.size() == 0) {
                answer++;
            }
        }
        return answer;
    }
}