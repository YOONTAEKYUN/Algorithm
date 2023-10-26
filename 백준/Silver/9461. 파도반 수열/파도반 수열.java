import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        long[][] dp = new long[count][];

        for (int i = 0; i<count; i++){
            int N = Integer.parseInt(br.readLine());
            dp[i] = new long[N + 1];
            if (N < 4){
                for (int j = 1; j <= N; j++){
                    dp[i][j] = 1;
                }
            }else {
                dp[i][1] = dp[i][2] = dp[i][3] = 1;
                for (int j = 4; j <= N; j++){
                    dp[i][j] = dp[i][j-2] + dp[i][j-3];
                }
            }
        }

        for (int i = 0; i < count; i++){
            System.out.println(dp[i][dp[i].length-1]);
        }
        br.close();
    }
}