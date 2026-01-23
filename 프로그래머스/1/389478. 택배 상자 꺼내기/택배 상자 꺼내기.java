class Solution {
    public int solution(int n, int w, int num) {
        // 22 , 6 , 8
        int answer = 0;
        int h = (n+w-1)/w;
        int[][] nums = new int[h][w];
        int k =1;
        for (int i = 0; i < h; i++) {
            
            if(i%2==0) {
                for(int j =0; j < w && k <= n; j++) {
                    nums[i][j] = k++;
                } 
            } else {
                for(int j = w -1; j >= 0 && k <= n; j--) {
                    nums[i][j] = k++;                   
                }
            }
            
        }
        

        int count = 0;
        int numx = 0;
        int numy = 0;
        for (int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++ ) {
                
                if (nums[i][j] == num) {
                    answer++;
                    numx = i;
                    numy = j;
                } 
            }
        }
        
        for(int i = numx + 1; i < h; i++){
            if (nums[i][numy] != 0) {
                answer++;
            }
        }
        
        return answer;
    }
}