import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static Long[][] dp;
    final static long MOD = 1000000000;
    public static Long solution(int n, int value) throws Exception {
        if (n == 1){
            return dp[1][value];
        }
        if (dp[n][value] == null){
            if (value == 0){
                dp[n][value] = solution(n-1, 1);
            } else if (value == 9){
                dp[n][value] = solution(n-1, 8);
            } else {
                dp[n][value] = solution(n-1, value-1) + solution(n-1, value+1);
            }
        }
        return dp[n][value] % MOD;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = 0;

        dp = new Long[n+1][10];
        for (int i = 0; i < 10; i++){
            dp[1][i] = 1L;
        }

        for (int i =1; i < 10; i++){
            result += solution(n, i);
        }

        System.out.println(result % MOD);
        br.close();
    }
}
