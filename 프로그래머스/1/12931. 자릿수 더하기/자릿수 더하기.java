import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] temp = Integer.toString(n).toCharArray();
        for(char a : temp) {
            answer += (a -'0');
        }
        return answer;
    }
}