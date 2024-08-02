class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i, visited, computers);
                answer ++;
            }
        }
        
        return answer;
    }
    
    private void dfs(int v, boolean[] visited, int[][] computers) {
            visited[v] = true;
            
            for(int i = 0; i < computers[0].length; i++) {
                if(computers[v][i] == 1 && !visited[i]) {
                    dfs(i, visited, computers);
                }
            }
        }
}