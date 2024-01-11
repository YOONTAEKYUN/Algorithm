import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();
        String[] listA = a.split("");
        String[] listB = b.split("");

        int[][] dp = new  int[listB.length + 1][listA.length + 1];

        for (int i = 1; i <= listB.length; i++) {
            for (int j = 1; j <= listA.length; j++) {
                if (listA[j-1].charAt(0) == listB[i-1].charAt(0)) {
                    dp[i][j] = dp[i-1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        bw.write(String.valueOf(dp[listB.length][listA.length]));
        bw.close();
        br.close();
    }
}