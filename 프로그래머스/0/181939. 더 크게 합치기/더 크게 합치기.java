class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        int iAb = Integer.parseInt(ab);
        int iBa = Integer.parseInt(ba);
        if (iAb >= iBa) {
            answer = iAb;
        } else {
            answer = iBa;
        }
        return answer;
    }
}