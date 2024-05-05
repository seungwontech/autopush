import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            
            if (i%5==0) {
                temp.add(names[i]);
            }
        }
        answer = temp.toArray(new String[temp.size()]);
        return answer;
    }
}