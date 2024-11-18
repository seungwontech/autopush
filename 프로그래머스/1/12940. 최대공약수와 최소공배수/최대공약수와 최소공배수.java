class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }
    private static int gcd(int a, int b) {
        int r = a % b;
        if(r == 0) {
            return b;
        }
        return gcd(b, r);
    }
}