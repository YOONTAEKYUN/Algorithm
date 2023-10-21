import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //dp]i] : i번째 까지의 수열 중 i를 포함하는 가장 긴 감소하는 부분 수열의 길이
        dp = new int[N + 1];
        String[] input = br.readLine().split(" ");
        int[] inputInt = new int[N + 1];

        for (int i = 1; i<= N; i++){
            inputInt[i] = Integer.parseInt(input[i-1]);
            dp[1] = 1;
            int[] candidate = new int[N+1];
            int min = 0;
            if (i > 1){
                for (int j = 1; j < i; j++){
                    if (inputInt[i] < inputInt[j] ){
                        candidate[j] = dp[j];
                    }
                }
                for (int j = 1; j< i; j++){
                    min = Math.max(min, candidate[j]);
                }
                dp[i] = min + 1;
            }
        }
        int min = 0;
        for (int i = 1; i <= N; i++){
            min = Math.max(min, dp[i]);
        }
        System.out.println(min);

        br.close();
    }
}