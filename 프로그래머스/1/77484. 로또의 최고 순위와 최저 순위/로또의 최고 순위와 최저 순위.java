import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {        
        int min_win = 7;
        int max_win = 0;
        
        for(int i =0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                max_win ++;
            }
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    min_win --;
                }
            }
        }        
        max_win = min_win - max_win;
        if(min_win == 7) min_win = 6;
        if(max_win == 7) max_win = 6;
        
        int[] answer = {max_win, min_win};
        return answer;
    }
}