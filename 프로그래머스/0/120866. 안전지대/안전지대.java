class Solution {
    static boolean[][] visited;
    public int solution(int[][] board) {
        visited = new boolean[board.length][board[0].length];
        int answer = 0;
        int totCnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 0) {
                    boom(board, i, j);
                }
            }
            totCnt += board[i].length;
        }
        int trueCnt = 0;
        for(int i = 0; i < visited.length; i++){
            for(int j =0; j < visited[i].length; j++) {
                if (visited[i][j] == true){
                    trueCnt++;    
                }
            }
        }
        answer = totCnt - trueCnt;
        return answer;
    }
    
    static void boom(int[][] board, int x, int y) {
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++){
                if (i >= 0 && i < board.length && j >= 0 && j < board[i].length) {
                    visited[i][j] = true;
                }
            }
        }
    }
}