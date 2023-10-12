import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static long[][]dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new long[n+1][2];
        dp[1][0] = 0L; dp[1][1] = 1L;

        for (int i = 1; i < n+1; i++){
            for (int j = 0; j < 2; j++){
                if (i == 1){ break;}
                if (j == 0){
                    dp[i][0] = dp[i-1][0] + dp[i-1][1];
                }else {
                    dp[i][1] = dp[i-1][0];
                }
            }
        }
        System.out.println(dp[n][0] + dp[n][1]);
        br.close();

    }
}
