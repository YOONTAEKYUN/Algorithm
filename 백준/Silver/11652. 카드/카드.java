import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> cardList = new HashMap<>();

        int idx = 0;
        long max = 0;

        long result = 0;
        int firstMinCheck = 0;

        for (int i = 0; i < N; i++) {
            String inputNum = br.readLine();
            if (cardList.get(inputNum) == null) {
                cardList.put(inputNum, 1);
            } else {
                int before = cardList.get(inputNum);
                cardList.put(inputNum, before + 1);
            }
        }

        int[] cardArray = new int[cardList.values().size() + 1];

        for (int num : cardList.values()) {
            cardArray[idx] = num;
            idx++;
        }
        for (int i = 0; i < cardArray.length; i++) {

            if (i == 0) {
                max = cardArray[i];
            } else {
                max = Math.max(max, cardArray[i]);
            }
        }

        for (String inputNum : cardList.keySet()) {
            if (cardList.get(inputNum) == max) {
                if (firstMinCheck == 0) {
                    result = Long.parseLong(inputNum);
                    firstMinCheck = 1;
                } else {
                    result = Math.min(result, Long.parseLong(inputNum));
                }
            }
        }

        System.out.println(String.valueOf(result));

        br.close();
    }
}