import java.util.HashMap;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashMap<String, Integer> map = new HashMap<>();
        map.put(words[0], 0);
        
        for(int i = 1; i < words.length; i++) {
            map.put(words[i], 0);
            
            if (words[i-1].charAt(words[i-1].length() -1) != words[i].charAt(0) || map.size() < i + 1 ){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }
        return answer;
    }
}