import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] cardList = new long[N];

        for (int i = 0; i < cardList.length; i++) {
            cardList[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(cardList);

        long result = cardList[0]; // 초기화
        int maxCount = 1; // 최대 빈도수
        int count = 1; // 현재 빈도수

        for (int i = 1; i < cardList.length; i++) {
            if (cardList[i] == cardList[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
                result = cardList[i];
            }
        }

        System.out.println(result);
        br.close();
    }
}
