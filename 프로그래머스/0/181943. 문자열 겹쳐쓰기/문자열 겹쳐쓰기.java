class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] tempArr = my_string.toCharArray();
        for (int i = 0; i < overwrite_string.length(); i++) {
            tempArr[s++] = overwrite_string.charAt(i);
        }
        for (int i = 0; i < tempArr.length; i++) {
            answer += tempArr[i];
        }
        return answer;
    }
}