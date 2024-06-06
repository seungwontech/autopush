class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] a = number.split("");
        int temp = 0;
        for(int i = 0 ; i < a.length; i++) {
            temp += Integer.parseInt(a[i]);
        }
        answer = temp%9;
        return answer;
    }
}