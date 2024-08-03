import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        Map<String, Integer> checkMap = new HashMap<>();
        Queue<String> q = new LinkedList<>();
        
        q.offer(begin);
        checkMap.put(begin, 0);
        
        while(!q.isEmpty()) {
            String current = q.poll();
            int size = current.length();
            
            if(current.equals(target)) {
                answer = checkMap.get(current);
                break;
            }
            
            for(int i = 0; i < size; i++) {
                char[] str = current.toCharArray();
                for(char ch = 'a'; ch < 'z'; ch++) {
                    str[i] = ch;
                    String changed = new String(str);
                    
                    if(wordSet.contains(changed) && !checkMap.containsKey(changed)){
                        q.offer(changed);
                        checkMap.put(changed, checkMap.get(current) + 1);
                    }
                }
            }
            
        }
        
        return answer;
    }
}