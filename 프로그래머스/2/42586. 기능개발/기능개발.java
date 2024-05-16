import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] days = new int[progresses.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < progresses.length; i++) {
            days[i] = ((int) Math.ceil((double)(100 - progresses[i]) / speeds[i]));
        }
        
        ArrayList<Integer> answerList = new ArrayList<>();
        int idx = 0;
        while(idx < progresses.length){
            int count = 1;
            int curDay = days[idx];

            while(idx + count < progresses.length && days[idx + count] <= curDay) {
                count++;
            }
            answerList.add(count);
            idx += count;
        }
        stack.addAll(answerList);
        
        answer = new int[stack.size()];
        
        for (int i = stack.size() - 1; i >= 0; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}