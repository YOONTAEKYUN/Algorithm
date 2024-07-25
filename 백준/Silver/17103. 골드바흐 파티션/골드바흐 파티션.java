import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] result = new int[T];
        Arrays.fill(result, 0);

        boolean[] isPrime = new boolean[1000001];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(br.readLine());
            for(int j = 2; j <= input/2; j++) {
                if (isPrime[j] && isPrime[input - j]) {
                    result[i]++;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        br.close();
        
    }
}
