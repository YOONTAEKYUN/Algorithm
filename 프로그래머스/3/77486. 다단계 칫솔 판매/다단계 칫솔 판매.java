import java.util.*;

class Solution {
    Map<String, Integer> result = new HashMap<String, Integer>();
    Map<String, String> referralMap = new HashMap<String, String>();
    
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        for (int i = 0; i < enroll.length; i++) {
            result.put(enroll[i], 0);
            referralMap.put(enroll[i], referral[i]);
        }
        
        for(int i = 0; i < seller.length; i++) {
            distributeProfit(seller[i], amount[i] * 100);
        }
        
        int[] answer = new int[enroll.length];
        for(int i = 0; i < enroll.length; i++) {
            answer[i] = result.get(enroll[i]);
        }
        return answer;
    }
    
    private void distributeProfit(String seller, int profit) {
        while(true){
            int fee = profit / 10;
            result.put(seller, result.get(seller) + profit - fee);
            
            if(fee < 1) break;
            
            String referral = referralMap.get(seller);
            if(referral.equals("-")) break;
            
            seller = referral;
            profit = fee;
        }
    }
}