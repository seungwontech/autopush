class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean temp = false;
        if (ineq.equals(">") && eq.equals("=")) {
            System.out.println(n >= m);
            temp =n >= m;
        } else if(ineq.equals(">") && eq.equals("!")) {
            System.out.println(n > m);
            temp =n > m;
        } else if(ineq.equals("<") && eq.equals("=")){
            System.out.println(n <= m);
            temp =n <= m;
        } else if(ineq.equals("<") && eq.equals("!")){
            System.out.println(n < m);
            temp =n < m;
        }
        if(temp) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}