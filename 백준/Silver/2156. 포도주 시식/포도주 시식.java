import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        int[] input = new int[n+1];

        for (int i = 1; i <= n; i++){
            input[i] = Integer.parseInt(br.readLine());
        }
        if (n == 1){
            dp[1] = input[1];
        }
        else if (n == 2){
            dp[1] = input[1];
            dp[2] = input[1] + input[2];
        }
        else {
            dp[1] = input[1];
            dp[2] = input[1] + input[2];
            for (int i =3; i<=n; i++){
                dp[i] = Math.max(dp[i-1],Math.max(dp[i-2] + input[i], dp[i-3] + input[i-1] + input[i]));
            }
        }
        System.out.print(dp[n]);

        br.close();
    }
}