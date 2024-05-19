class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int a = num_list[num_list.length - 1];
        int b = num_list[num_list.length - 2];
        int temp = 0;
        if (a > b) {
            temp = a - b;
        } else {
            temp = a * 2;
        }
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = temp;
        return answer;
    }
}