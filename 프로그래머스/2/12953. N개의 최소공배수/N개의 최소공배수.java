class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int a = arr[0];
        int b = arr[1];
        int g = gcd(a, b); //최대 공약수
        answer = a * b / g; // 최소공배수
        for (int i = 2; i < arr.length; i++) {
            g = gcd(answer, arr[i]);
            answer = answer * arr[i] / g;
        }
        
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