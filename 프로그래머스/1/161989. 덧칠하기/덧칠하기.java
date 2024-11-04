class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] temp = new int[n];
        for (int i =0; i< section.length; i++) {
            temp[section[i] - 1 ] = 1;
        }
        
        for(int i =0; i< temp.length; i++) {
            if (temp[i] == 1) {
                for(int j = i; j < i + m; j++) {
                    if (j == temp.length) {
                        break;
                    }
                    if (temp[j] == 1) {
                        temp[j] = 0;
                    }
                }
                answer++;
            } 
        }
        
        return answer;
    }
}