import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();

        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(S.indexOf(i) + " ");
        }
        System.out.println(sb);

        br.close();
    }
}