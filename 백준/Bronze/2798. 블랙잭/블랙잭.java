import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[] inputString = br.readLine().split(" ");
        int[] input = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
        int tempResult = 0;

        for (int i = 0; i < input.length - 2; i++) {
            for (int j = i + 1; j < input.length - 1; j++) {
                for (int k = j + 1; k < input.length; k++) {
                    int currentTotal = input[i] + input[j] + input[k];
                    if (currentTotal <= M) {
                        if (currentTotal > tempResult) {
                            tempResult = currentTotal;
                        }
                    }
                }
            }
        }

        System.out.println(tempResult);
        br.close();
    }
}