import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        String az = "abcdefghijklmnopqrstuvwxyz";
        int[] result = new int[az.length()];
        Arrays.fill(result, -1);
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < az.length(); j++) {
                if (S.charAt(i) == az.charAt(j) & result[j] == -1) {
                    result[j] = i;
                }
            }
            S.charAt(i);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        br.close();
    }
}