import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] tempArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            tempArr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(tempArr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[0].equals("0")) {
                answer = "0";
            }else {
                answer += tempArr[i];
            }
        }
        return answer;
    }
}