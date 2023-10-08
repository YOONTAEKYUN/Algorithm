import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(fibonacci(n));
        System.out.println(sb);
        br.close();
    }

    private long fibonacci(int n) {
        long sum = 1;
        long f1 = 0;
        long f2 = 1;

        for(int i = 1 ; i < n ; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
