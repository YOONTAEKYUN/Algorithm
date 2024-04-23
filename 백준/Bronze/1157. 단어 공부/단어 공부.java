import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] AZ = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                "T", "U", "V", "W", "X", "Y", "Z" };
        int[] result = new int[AZ.length];
        Arrays.fill(result, 0);
        int max = 0;
        String output = "";
        int same = 0;

        String[] input = br.readLine().toUpperCase().split("");

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < AZ.length; j++) {
                if (AZ[j].equals(input[i])) {
                    result[j] += 1;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
                output = AZ[i];
                same = 0;
            } else if (max > 0 & result[i] == max) {
                same = 1;
            }
        }

        if (same == 1) {
            System.out.println("?");
        } else {
            System.out.println(output);
        }

        br.close();
    }
}