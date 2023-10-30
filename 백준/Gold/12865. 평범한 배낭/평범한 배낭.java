import java.util.Scanner;

public class Main {
    static int N, K;
    static int[][] items;
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        items = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            items[i][0] = sc.nextInt();
            items[i][1] = sc.nextInt();
        }
        max = 0;

        int[] dp = new int[K + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = K; j >= items[i][0]; j--) {
                dp[j] = Math.max(dp[j], dp[j - items[i][0]] + items[i][1]);
            }
        }

        System.out.println(dp[K]);
        sc.close();
    }
}