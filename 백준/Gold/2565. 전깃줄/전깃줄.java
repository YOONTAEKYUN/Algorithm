import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new  int[N];
        //dp[i]: input[i] 값을 마지막으로 하는 최장 부분 수열의 원소의 개수
        int[][] wire = new int[N][2];

        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            wire[i][0] = Integer.parseInt(st.nextToken());
            wire[i][1] = Integer.parseInt(st.nextToken());
        }

        // 첫 번째 원소(A전봇대)를 기준으로 오름차순으로 정
        Arrays.sort(wire, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        return o1[0] - o2[0];
                    }
                });

        dp[0] = 1;
        for (int i = 1; i < N; i++) {
            int[] candidate = new int[N];
            for (int j = 0; j < i; j++) {
                if (wire[i][1] > wire[j][1]){
                    candidate[j] = dp[j];
                }
            }
            int max = 0;
            for (int j = 0; j < i; j++) {
                max = Math.max(max, candidate[j]);
            }
            dp[i] = max + 1;
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            if (max < dp[i]){
                max = dp[i];
            }
        }


        sb.append(N - max);
        bw.append(sb);bw.flush();bw.close();br.close();br.close();
    }
}