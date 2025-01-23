class Solution {
    public int solution(int n) {
        int answer = pibo(n);
        System.out.println(answer);
        return answer;
    }
    
    public int pibo(int n) {
        int[] temp = new int[n+1];
        temp[0]= 0;
        temp[1]= 1;
        for(int i = 2; i <= n; i++) {
            temp[i] = (temp[i-1] + temp[i-2])% 1234567;
        }
        return temp[n] % 1234567;
    }
}