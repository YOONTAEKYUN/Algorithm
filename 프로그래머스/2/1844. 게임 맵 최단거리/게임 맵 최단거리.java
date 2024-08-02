import java.util.*;

class Solution {
    int[] x = {0,0,1,-1};
    int[] y = {1,-1,0,0};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0,0,1});
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int dx = current[0];
            int dy = current[1];
            int distance = current[2];
            
            if(dx == n - 1 && dy == m -1) {
                return distance;
            }
            
            for(int i = 0; i < 4; i++) {
                int cx = dx + x[i];
                int cy = dy + y[i];
                
                if(cx >= 0 && cy >= 0 && cx < n && cy < m &&  maps[cx][cy] == 1 && !visited[cx][cy]) {
                    q.offer(new int[] {cx, cy, distance + 1});
                    visited[cx][cy] = true;
                }
            }
        }
        
        return -1;
    }
}