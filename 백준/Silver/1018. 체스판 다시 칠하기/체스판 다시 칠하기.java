import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 보드의 크기 N과 M
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        // 보드 입력 받기
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int minCount = Integer.MAX_VALUE;

        // 8x8 체스판을 이동하며 최소 다시 칠해야 하는 정사각형의 개수 계산
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minCount = Math.min(minCount, calculateRepaintCount(board, i, j));
            }
        }

        System.out.println(minCount);

        br.close();
    }

    // 주어진 시작 위치에서 8x8 체스판을 탐색하여 최소 다시 칠해야 하는 정사각형의 개수 계산
    private static int calculateRepaintCount(char[][] board, int startX, int startY) {
        int repaintCount = 0;

        // 시작 위치에서 8x8 체스판을 탐색
        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                // 현재 칸의 색과 기대되는 색이 다른 경우 다시 칠해야 함
                if ((i + j) % 2 == 0) { // 행 번호와 열 번호의 합이 짝수인 경우
                    if (board[i][j] != 'W') {
                        repaintCount++;
                    }
                } else { // 행 번호와 열 번호의 합이 홀수인 경우
                    if (board[i][j] != 'B') {
                        repaintCount++;
                    }
                }
            }
        }

        // 해당 체스판을 흰색으로 시작했을 때와 검은색으로 시작했을 때 중에서 최소값 반환
        return Math.min(repaintCount, 64 - repaintCount);
    }
}
