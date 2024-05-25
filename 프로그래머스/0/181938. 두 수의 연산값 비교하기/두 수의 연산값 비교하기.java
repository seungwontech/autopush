class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strVal = String.valueOf(a) + String.valueOf(b);
        int intVal = 2 * a * b;
        
        if (Integer.parseInt(strVal) >= intVal) {
            answer = Integer.parseInt(strVal);
        } else {
            answer = intVal;
        }
        return answer;
    }
}