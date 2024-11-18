class Solution {
    public long solution(int n) {
        int[] temp = new int[2001];
        temp[1] = 1;
        temp[2] = 2;
        for(int i = 3; i < 2001; i++) {
            temp[i] = (temp[i - 1] + temp[i - 2])%1234567;
        }
        
        return temp[n];
    }
}