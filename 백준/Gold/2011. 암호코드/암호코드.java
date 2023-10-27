import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    private static final int MOD = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String messages = br.readLine();

        int[] dp = new int[messages.length()+1];
        dp[0] = 1;

        for(int i=1; i<=messages.length(); i++) {
            int now = messages.charAt(i-1) - '0';
            if(now >= 1 && now <= 9) {
                dp[i] += dp[i-1];
                dp[i] %= MOD;
            }

            if(i == 1) continue;

            int prev = messages.charAt(i-2) - '0';

            if(prev == 0) continue;

            int value = prev*10+now;

            if(value >= 10 && value <= 26) {
                dp[i] += dp[i-2];
                dp[i] %= MOD;
            }
        }
        System.out.println(dp[messages.length()]);
    }
}