import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");
        int result = 1;

        for (int i = 0; i < input.length / 2; i++) {
            if (input[i].equals(input[input.length - 1 - i])) {
            } else {
                result = 0;
            }
        }
        System.out.println(result);

        br.close();
    }
}