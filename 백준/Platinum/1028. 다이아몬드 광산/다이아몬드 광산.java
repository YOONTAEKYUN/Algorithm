import java.util.Scanner;

public class Main {
    static final int maxRC = 800;
    static final int UL = 1, UR = 2, DL = 3, DR = 4;
    static final int DIR = 4;
    static final int[][] dirRef = {{0, 0}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
    static int r, c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        c = scanner.nextInt();

        int[][] map = new int[maxRC][maxRC];
        int[][][] diaRow = new int[DIR + 1][maxRC][maxRC];

        for (int i = 1; i <= r; i++) {
            String tempString = scanner.next();
            for (int j = 1; j <= c; j++) {  // 인덱스를 1부터 시작하도록 수정
                map[i][j] = (tempString.charAt(j - 1) == '0' ? 0 : 1);  // 인덱스 오류 수정
            }
        }

        findMaxRow(map, diaRow);
        System.out.println(findMaxDia(diaRow));
    }

    public static int minAmongFour(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static void findMaxRow(int[][] map, int[][][] diaRow) {
        for (int i = UL; i <= UR; i++) {
            for (int j = 1; j <= r; j++) {
                for (int k = 1; k <= c; k++) {
                    if (map[j][k] == 0) diaRow[i][j][k] = 0;
                    else diaRow[i][j][k] = diaRow[i][j + dirRef[i][0]][k + dirRef[i][1]] + 1;
                }
            }
        }

        for (int i = DL; i <= DR; i++) {
            for (int j = r; j >= 1; j--) {
                for (int k = 1; k <= c; k++) {
                    if (map[j][k] == 0) diaRow[i][j][k] = 0;
                    else diaRow[i][j][k] = diaRow[i][j + dirRef[i][0]][k + dirRef[i][1]] + 1;
                }
            }
        }
    }

    public static int findMaxDia(int[][][] diaRow) {
        int maxDia = 0;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                int maxAbleSize = minAmongFour(i, j, r - i + 1, c - j + 1);
                for (int k = maxAbleSize; k >= 1; k--) {
                    if (diaRow[UL][i][j + k - 1] >= k && diaRow[UR][i][j - k + 1] >= k &&
                            diaRow[DL][i][j + k - 1] >= k && diaRow[DR][i][j - k + 1] >= k) {
                        maxDia = Math.max(maxDia, k);
                        break;
                    }
                }
            }
        }
        return maxDia;
    }
}
