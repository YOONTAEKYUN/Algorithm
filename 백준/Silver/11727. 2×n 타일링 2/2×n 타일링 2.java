import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        dp[0] = dp[1] = 1;

        System.out.println(solve(N));

    }

    private static int solve(int N) {
        if (dp[N] == null){
            dp [N] = solve(N - 1) + solve(N - 2) + solve(N - 2);
        }
        return dp[N] % 10007;
    }
}