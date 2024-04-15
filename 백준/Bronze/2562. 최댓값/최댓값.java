import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = new int[9];
        int max = 0;
        int max_idx = -1;

        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
                max_idx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(max_idx);

        br.close();
    }
}