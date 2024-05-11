import java.util.ArrayList;
class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = {};
        
        ArrayList<Integer> answerTemp = new ArrayList<>();
        for (int i = start; i >= end_num; i--) {
            answerTemp.add(i);
        }
        answer = new int[answerTemp.size()];
        for (int i = 0; i < answerTemp.size(); i++) {
            answer[i] = answerTemp.get(i);
        }
        return answer;
    }
}