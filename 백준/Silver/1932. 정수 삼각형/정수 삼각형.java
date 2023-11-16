import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] input = new int[N+1][];

        for (int i = 0; i < N; i++) {
            input[i] = new int[i+1];
            String[] inp = br.readLine().split(" ");
            for (int j = 0; j <= i; j++) {
                input[i][j] = Integer.parseInt(inp[j]);
            }
        }

        for (int i = N-2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                input[i][j] += Math.max(input[i + 1][j], input[i + 1][j + 1]);
            }
        }

        sb.append(input[0][0]);
        bw.append(sb);bw.flush();bw.close();br.close();br.close();
    }
}