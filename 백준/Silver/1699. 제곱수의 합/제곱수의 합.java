import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j, N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        for(i=1;i<=N;i++) dp[i] = i;
        for(i=2;i<=N;i++)
            for(j=2;j*j<=i;j++)
                dp[i] = Math.min(dp[i], dp[i-j*j]+1);
        System.out.println(dp[N]);
        br.close();
    }
}