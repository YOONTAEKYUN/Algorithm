import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //dp]i] : i번째 까지의 수열 중 i를 포함하는 최대 증가 수열의 원소들의 합
        dp = new int[N + 1];
        String[] input = br.readLine().split(" ");
        int[] inputInt = new int[N + 1];

        for (int i = 1; i<= N; i++){
            inputInt[i] = Integer.parseInt(input[i-1]);
            dp[1] = inputInt[1];
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
                dp[i] = max + inputInt[i];
            }
        }
        int max = 0;
        for (int i = 1; i <= N; i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);

        br.close();
    }
}