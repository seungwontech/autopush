import java.util.*;
class Solution {
    public int solution(String dirs) {
        Set<String> visitedPaths = new HashSet<>();
        int x = 5, y = 5;
        int answer = 0;

        for (char dir : dirs.toCharArray()) {
            int prevX = x;
            int prevY = y;
            if (dir == 'U' && y < 10) y++;
            else if (dir == 'D' && y > 0) y--;
            else if (dir == 'R' && x < 10) x++;
            else if (dir == 'L' && x > 0) x--;
            if (prevX != x || prevY != y) {
                int from = prevX * 11 + prevY;
                int to = x * 11 + y;
                String path = Math.min(from, to) + "-" + Math.max(from, to);
                if (!visitedPaths.contains(path)) {
                    visitedPaths.add(path);
                    answer++;
                }
            }
        }

        return answer;
    }
}