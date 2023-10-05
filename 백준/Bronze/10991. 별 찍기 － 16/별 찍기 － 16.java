import java.io.IOException;
import java.util.Scanner;

public class Main {
    public void solution() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i< n; i++) {
            System.out.print(" ".repeat(n-i-1) );
            for (int j = 0; j < i + 1; j++){
                System.out.print("* ");
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
