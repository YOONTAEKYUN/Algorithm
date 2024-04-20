import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String S = input[1];

            for (int j = 0; j < S.length(); j++) {
                char[] addString = new char[R];
                Arrays.fill(addString, S.charAt(j));
                sb.append(addString);

            }
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}