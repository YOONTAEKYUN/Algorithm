import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j, N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        if (N > 1){
            dp[2] = 3;
        }
        for(i=4;i<=N;i++)
            if (i % 2 == 0){
                for (j=i-2;j >= 0; j-=2){
                    if (j == i-2){
                        dp[i] = dp[j] * 3;
                    } else if (j > 0){
                        dp[i] += dp[j] * 2;
                    } else {
                        dp[i] += 2;
                    }
                }
            }

        System.out.println(dp[N]);
        br.close();
    }
}