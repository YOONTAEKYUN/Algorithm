import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        long[][] dp = new long[N+1][K+1];

        for (int i =1; i<=N; i++){
            for (int j = 1; j<=K; j++){
                dp[1][j] = j;
                dp[i][1] = 1;
            }
        }
        for (int i = 2; i<=N; i++){
            for (int j = 2; j<=K; j++){
                dp[i][j] = (dp[i][j-1] + dp[i-1][j]) %1000000000;
            }
        }
        System.out.println(dp[N][K]%1000000000);

        br.close();
    }
}