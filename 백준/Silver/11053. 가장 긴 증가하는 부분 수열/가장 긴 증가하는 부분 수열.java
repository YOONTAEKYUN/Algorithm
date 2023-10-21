import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        String[] input = br.readLine().split(" ");
        int[] inputInt = new int[N + 1];
//        int max_i = 0; //i까지 중 최대 dp 값를 갖는 인덱스

        for (int i = 1; i<= N; i++){
            inputInt[i] = Integer.parseInt(input[i-1]);
            dp[i] = 1;
            int[] candidate = new int[N+1];
            int max = 0;
            if (i > 1){
                for (int j = 1; j < i; j++){
                    if (inputInt[i] > inputInt[j] ){
                        candidate[j] = dp[j];
                    }
                }
                for (int j = 1; j< i; j++){
                    max = Math.max(max, candidate[j]);
                }
                dp[i] = max + 1;
            }
//            if (i == 1){
//               max_i = 1;
//            } else if (i == 2 && inputInt[i] > inputInt[1]) {
//                dp[i] += dp[1];
//                max_i = 2;
//            } else {
//                for (int j = 1; j < i; j++) {
//                    if (inputInt[i] > inputInt[j]) {
//                        dp[i] = dp[j] + 1;
//                        if (dp[i] > dp[max_i]) {
//                            max_i = i;
//                        }
//                    }
//                }
//            }
        }
        int max = 0;
        for (int i = 1; i <= N; i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);

        br.close();
    }
}