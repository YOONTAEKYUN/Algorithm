import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(calculatePackage(N));
        br.close();
    }

    private static int calculatePackage(int N) {
        int quotient = N / 5; 
        for (int i = quotient; i >= 0; i--) {
            int remainder = N - (i * 5); 
            if (remainder % 3 == 0) {
                return i + (remainder / 3); 
            }
        }
        return -1; 
    }
}
