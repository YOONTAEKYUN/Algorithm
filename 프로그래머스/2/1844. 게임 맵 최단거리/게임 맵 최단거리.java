import java.util.*;

class Solution {
    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,1,-1};
    
    public int solution(int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        int n = maps.length;
        int m = maps[0].length;
        boolean[][]  visited = new boolean[n][m];
        
        q.offer(new int[] {0,0,1});
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];
            
            if(x == n-1 && y == m-1) {
                return distance;
            }
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= 0 && ny >= 0 
                   && nx < n && ny < m
                   && maps[nx][ny] == 1 
                   && !visited[nx][ny]){
                    q.offer(new int[] {nx, ny, distance + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }
}