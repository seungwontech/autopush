class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] cntrol = new String[control.length()];
        for (int i = 0; i <  control.length(); i++) {
            cntrol[i] = String.valueOf(control.charAt(i));
        }
        for (int i = 0; i < cntrol.length; i++) {
            if ("w".equals(cntrol[i])) {
                n += 1; 
            } else if ("s".equals(cntrol[i])) {
                n -= 1;
            } else if ("d".equals(cntrol[i])) {
                n += 10;
            } else if ("a".equals(cntrol[i])) {
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
}