import java.io.*;

public class Main{
    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        dp = new long[N+2];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i=3; i <= N ; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%15746;
        }
        sb.append(dp[N]);
        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
        br.close();

    }
}