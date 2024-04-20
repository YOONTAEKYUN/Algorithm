import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] result = new String[T];

        for (int i = 0; i < T; i++) {
            String S = br.readLine();
            result[i] = S.charAt(0) + "" + S.charAt(S.length() - 1);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        br.close();
    }
}