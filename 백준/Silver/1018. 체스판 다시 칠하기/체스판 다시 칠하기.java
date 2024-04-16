import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ex) 10 * 13
        String[] NM = br.readLine().split(" ");
        // row 10
        int N = Integer.parseInt(NM[0]);
        // column 13
        int M = Integer.parseInt(NM[1]);

        String[][] chessboard = new String[N][M];

        // 현재 빈도수
        int tempResult = 0;
        // 최소 빈도수
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            chessboard[i] = br.readLine().split("");
        }

        // ex) 10 * 13: 첫 왼쪽 위(기준)의 범위 [0][0]~[2][5]
        // 8x8 chessboard cutting
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                // 체스판 고정
                tempResult = 0;
                // System.out.printf("start index point [%d][%d]: \n", i, j);
                // chessboard[i][j] 체스판 첫 왼쪽 위 색(기준) (경우의 수 둘다 구해서 대소 비교필)
                // if (chessboard[i][j].equals("B"))
                {
                    for (int k = 0; k < 8; k++) {
                        for (int z = 0; z < 8; z++) {
                            // System.out.print(chessboard[i + k][j + z] + " ");
                            // [홀수][홀수] or [짝수][짝수] -> b
                            if ((i + k) % 2 != 0 & (j + z) % 2 != 0 | ((i + k) % 2 == 0 & (j + z) % 2 == 0)) {
                                if (chessboard[i + k][j + z].equals("B")) {
                                    // System.out.print("0 ");
                                } else {
                                    tempResult += 1;
                                    // System.out.print("1 ");
                                }
                            } else { // 나머지 -> w
                                if (chessboard[i + k][j + z].equals("W")) {
                                    // System.out.print("0 ");
                                } else {
                                    tempResult += 1;
                                    // System.out.print("1 ");
                                }
                            }
                        }
                        // System.out.println();
                    }
                }

                if (tempResult < result) {
                    result = tempResult;
                }
                tempResult = 0;
                // else if (chessboard[i][j].equals("W"))
                {
                    for (int k = 0; k < 8; k++) {
                        for (int z = 0; z < 8; z++) {
                            // System.out.print(chessboard[i + k][j + z] + " ");
                            // [홀수][홀수] or [짝수][짝수] -> w
                            if ((i + k) % 2 != 0 & (j + z) % 2 != 0 | ((i + k) % 2 == 0 & (j + z) % 2 == 0)) {
                                if (chessboard[i + k][j + z].equals("W")) {
                                    // System.out.print("0 ");
                                } else {
                                    tempResult += 1;
                                    // System.out.print("1 ");
                                }
                            } else { // 나머지 -> b
                                if (chessboard[i + k][j + z].equals("B")) {
                                    // System.out.print("0 ");

                                } else {
                                    tempResult += 1;
                                    // System.out.print("1 ");
                                }
                            }
                        }
                        // System.out.println();
                    }
                }

                // System.out.printf("tempResult: %d || result: %d \n\n", tempResult, result);
                // 현재 체스 판(8x8)에서 칠할 횟수: tempResult 비교
                if (tempResult < result) {
                    result = tempResult;
                }
            }
        }
        System.out.println(result);
        // bw.write("\n");
        // bw.flush();
        // bw.close();

        br.close();
    }
}