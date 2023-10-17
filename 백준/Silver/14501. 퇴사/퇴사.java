import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        int[] T = new int[n+1];
        int[] P = new int[n+1];

        for (int i = 0; i <= n; i++){
            if (i != 0){
                String[] input = br.readLine().split(" ");
                T[i] = Integer.parseInt(input[0]);
                P[i] = Integer.parseInt(input[1]);
            }
            dp[i] = 0;
        }

        for (int i = 1; i<= n; i++){
            int idx = i + T[i] - 1;
            if (idx <= n){
                dp[idx] = Math.max(dp[i-1] + P[i], dp[idx]);
            }
            dp[i] = Math.max(dp[i-1], dp[i]);
        }

        System.out.println(dp[n]);
        br.close();

    }
}
