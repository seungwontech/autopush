import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for (char i : s.toCharArray()){
            if ('(' == i) {
                stack.push(i);
            } else if (')' == i) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        answer = stack.isEmpty();
        return answer;
    }
}