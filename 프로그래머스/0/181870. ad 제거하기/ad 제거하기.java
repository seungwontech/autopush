import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                temp.add(strArr[i]);
            }
        }
        answer = new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}