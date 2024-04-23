import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] az = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z" };
        int[] azCnt = new int[az.length];
        Arrays.fill(azCnt, 0);
        int result = N;
        int tmp = 0;

        for (int i = 0; i < N; i++) {
            tmp = 0;
            Arrays.fill(azCnt, 0);
            String[] inputString = br.readLine().split("");

            for (int j = 0; j < inputString.length - 1; j++) {
                if (tmp == 0) {
                    if (inputString[j].equals(inputString[j + 1])) {
                    } else {
                        for (int j2 = 0; j2 < az.length; j2++) {
                            if (inputString[j].equals(az[j2])) {
                                azCnt[j2] = 1;
                                break;
                            }
                        }
                        for (int j2 = 0; j2 < az.length; j2++) {
                            if (inputString[j + 1].equals(az[j2])) {
                                if (azCnt[j2] != 0) {
                                    result -= 1;
                                    tmp = 1;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}