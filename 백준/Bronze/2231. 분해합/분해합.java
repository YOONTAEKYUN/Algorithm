import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int answer = 0;
        int result = 0;

        for (int i = input; i > 0; i--) {
            String iString = String.valueOf(i);
            answer = i;
            for (int j = 0; j < iString.length(); j++) {
                answer += Integer.parseInt(iString.substring(j, j + 1));
            }
            if (answer == input) {
                result = Integer.parseInt(iString);
            }
            answer = 0;
        }

        System.out.println(result);
        br.close();
    }
}