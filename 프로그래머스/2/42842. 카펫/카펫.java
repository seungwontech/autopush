class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        
        for(int i = 1;  i < sum; i++) {
            if (sum%i==0) {
                int disum = sum/i;
                if ((i-2)*(disum-2) == yellow){
                    answer[0] = disum;
                    answer[1] = i;
                    return answer;
                    
                }
            }
        }
        
        return answer;
    }
}