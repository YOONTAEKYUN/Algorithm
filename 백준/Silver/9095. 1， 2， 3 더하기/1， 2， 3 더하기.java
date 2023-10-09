import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];

        int maxN = 0;
        for (int i = 0; i< N; i++){
            int num = Integer.parseInt(br.readLine());
            maxN = Math.max(num, maxN);
            result[i] = num;
        }

        dp = new Integer[maxN + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i =0; i< result.length; i++){
            int j = result[i];
            System.out.println(result[i] = solve(j));
        }
        br.close();
    }

    private static int solve(int num) {
        if (dp[num] == null){
            dp[num] =  solve(num - 1) + solve(num - 2) + solve(num -3);
        }
        return dp[num];
    }
}