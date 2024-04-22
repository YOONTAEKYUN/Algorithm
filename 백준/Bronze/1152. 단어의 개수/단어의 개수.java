import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().trim().split(" ");
        int result = input.length;

        for (int i = 0; i < input.length; i++) {
            if (input[i].length() == 0) {
                result -= 1;
            }
        }
        System.out.println(result);

        br.close();
    }
}