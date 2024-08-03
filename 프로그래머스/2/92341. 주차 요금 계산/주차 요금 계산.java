import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        
        Map<String, String> carIn = new HashMap<>();
        Map<String, Integer> carMap = new HashMap<>();
        
        for(String str: records) {
            String[] record = str.split(" ");
            String time = record[0];
            String carNum = record[1];
            String noti = record[2];
            
            if(noti.equals("IN")) {
                carIn.put(carNum, time);
            }
            
            if(noti.equals("OUT")) {
                String timeIn = carIn.get(carNum);
                carIn.put(carNum, "reset");
                if(carMap.containsKey(carNum)) {
                    int timeBefore = carMap.get(carNum);
                    carMap.put(carNum, checkParkingTime(time, timeIn, timeBefore));
                }else{
                    carMap.put(carNum, checkParkingTime(time, timeIn, 0));
                }
            }
        }
        
        for(String carNum : carIn.keySet()) {
            if(!carIn.get(carNum).equals("reset")) {
                String timeIn = carIn.get(carNum);
                if(carMap.containsKey(carNum)) {
                    int timeBefore = carMap.get(carNum);
                    carMap.put(carNum, checkParkingTime("23:59", timeIn, timeBefore));
                }else{
                    carMap.put(carNum, checkParkingTime("23:59", timeIn, 0));
                }
            }
        }
        
        int size = carMap.size();
        int[] answer = new int[size];
        List<String> keySet = new ArrayList<>(carMap.keySet());
        Collections.sort(keySet);
        int idx = 0;
        for(String carNum: keySet) {
            int accumulationTime = carMap.get(carNum);
            if(accumulationTime <= baseTime) {
                answer[idx] = baseFee;
            }else {
                answer[idx] = baseFee + (int)(Math.ceil((double)(accumulationTime - baseTime) / unitTime) * unitFee);
            }
            idx++;
        }
        return answer;
    }
    
    private int checkParkingTime(String timeOut, String timeIn, int timeBefore) {
        int answer = 0;
        
        String[] tO = timeOut.split(":");
        String[] tI = timeIn.split(":");
        
        int in = Integer.valueOf(tI[0]) * 60 + Integer.valueOf(tI[1]);
        int out = Integer.valueOf(tO[0]) * 60 + Integer.valueOf(tO[1]);
    
        if(timeBefore == 0) {
            answer = out - in;
        }else {
            answer = out - in + timeBefore;
        }
        return answer;
    }
}