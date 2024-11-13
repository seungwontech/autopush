import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int a: tangerine) {
            temp.put(a, temp.getOrDefault(a, 0) + 1);
        }
        List<Integer> keySet = new ArrayList<>(temp.keySet());
        keySet.sort((size1, size2) -> temp.get(size2) - temp.get(size1)); 
        for (Integer size : keySet) {
            k -= temp.get(size);
            answer++;
            if (k <= 0) {
                break;
            }
        }
        return answer;
    }
}