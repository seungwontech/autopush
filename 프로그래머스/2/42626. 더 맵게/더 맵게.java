import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.offer(i);
        }
        int minCnt = 0;
        while(pq.peek() < K) {
            int a = pq.poll();
             if (pq.isEmpty()){
                return -1;
            }
            int b = pq.poll();
            pq.offer(a + (b * 2));
            minCnt++;
        }
        answer = minCnt;
        return answer;
    }
}