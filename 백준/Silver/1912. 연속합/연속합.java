import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] inputInt = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            inputInt[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = inputInt[0];
        int max = inputInt[0];

        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(dp[i - 1] + inputInt[i], inputInt[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}