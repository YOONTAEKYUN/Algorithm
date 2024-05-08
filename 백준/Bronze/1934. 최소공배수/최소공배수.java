import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input[] = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            while (true) {
                if (a > b) a -= b;
                else if (a < b) b -= a;
                else break;
            }
            sb.append(Integer.parseInt(input[0]) * Integer.parseInt(input[1])/a + "\n");
        }

        System.out.println(sb);
        br.close();
	}
}

