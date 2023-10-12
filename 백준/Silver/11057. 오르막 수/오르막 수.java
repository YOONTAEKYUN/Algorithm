import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static long[][]dp;
    final static long MOD = 10_007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        dp = new long[1002][10];
        for (int i = 0; i < 10; i++){
            dp[1][i] = 1 % MOD;
        }

        for (int k = 2; k <= 1001; k++){
            for (int i = 0; i < 10; i++){
                for (int j = i; j < 10 ; j++){
                    dp[k][i] += dp[k-1][j] % MOD;
                }
            }
        }
        System.out.println(dp[n+1][0] % MOD);
        br.close();

    }
}
