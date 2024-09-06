import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] temp = new int[rank.length];
        for(int i =0; i < rank.length; i++ ){
            if(attendance[i]) {
                temp[i] = rank[i];
            } else {
                rank[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(rank);
        
        for(int i= 0; i < rank.length; i++) {
            if (rank[0] == temp[i]){
                answer += 10000 * i;
            } else if (rank[1] == temp[i]) {
                answer += 100 * i;
            } else if (rank[2] == temp[i]){
                answer += i;
            }
        }
        return answer;
    }
}