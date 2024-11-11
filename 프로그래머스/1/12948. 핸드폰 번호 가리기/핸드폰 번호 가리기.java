class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] temp = phone_number.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if(i < temp.length - 4) {
                answer += "*";
            } else {
                answer += temp[i];
            }
        }
        return answer;
    }
}