class Solution
{
    public int solution(int n, int a, int b)
    {
        // 8 , 4, 7
        int answer = 0;
        while(a != b){
            a = (a+1)/2;
            b = (b+1)/2;
            answer++;
        }
        return answer;
    }
}