import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> participantMap = new HashMap<>();
        for (String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }
        
        for (String name : completion) {
            participantMap.put(name, participantMap.get(name) - 1);
        }
        
        for (String key : participantMap.keySet()){
            if (participantMap.get(key) > 0) {
                answer = key;
            }
        }
        return answer;
    }
}