import java.io.IOException;
import java.util.Scanner;

public class Main {
    public void solution() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i< n; i++) {
            System.out.println(" ".repeat(i) + "*".repeat(2 * n - 1 - (2 * i)));
        }
        for (int i = n; i > 1; i--) {
            System.out.println(" ".repeat(i-2) + "*".repeat(3 + (2 *(n - i))));
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
