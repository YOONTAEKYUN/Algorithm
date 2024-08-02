import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        
        if (!wordSet.contains(target)) return 0;
        
        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> distance = new HashMap<>();
        
        queue.offer(begin);
        distance.put(begin, 0);
        
        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current.equals(target)) {
                return distance.get(current);
            }
            
            for (int i = 0; i < current.length(); i++) {
                char[] chars = current.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    chars[i] = c;
                    String next = new String(chars);
                    if (wordSet.contains(next) && !distance.containsKey(next)) {
                        queue.offer(next);
                        distance.put(next, distance.get(current) + 1);
                    }
                }
            }
        }
        
        return 0;
    }
}