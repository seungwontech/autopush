class Solution {
    public String solution(String rny_string) {
        String answer = "";
        char[] rny_char = rny_string.toCharArray();
        for (int i = 0; i < rny_char.length; i++) {
            if (rny_char[i] == 'm') {
                answer += "rn";
            } else {
                answer += rny_char[i];
            }
        }
        return answer;
    }
}