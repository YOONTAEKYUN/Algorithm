import java.io.*;

public class Main {
    static long recurCount;
    static long dpCount = 1;
    static int[] dp;
    public static int recurFib(int n) {
        if (n == 1 || n == 2){
            recurCount += 1;
            return 1;
        }
        else{
            return (recurFib(n - 1) + recurFib(n - 2));
        }
    }

    public static int dpFib(int n){
        dp[0] = dp[1] = 1;
        for(int i = 3; i<n; i++){
            dpCount += 1;
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        recurFib(N);
        dpFib(N);
        System.out.print(recurCount + " ");
        System.out.print(dpCount);
        br.close();
    }
}