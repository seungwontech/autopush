class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int temp = 1;
        for (int i = 0; i < num_list.length; i++){
            if (num_list.length <= 10){
                temp *= num_list[i];
                answer = temp;
            } else {
                answer += num_list[i]; 
            }
        }
        return answer;
    }
}