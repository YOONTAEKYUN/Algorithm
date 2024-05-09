import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(input[i]);
            int j = 2;
            while (j < a) {
                if (a % j == 0) {
                    break;
                }
                j++;
            }
            if (j == a) {
                count += 1;
            }
        }

        System.out.println(count);
        br.close();
	}
}

