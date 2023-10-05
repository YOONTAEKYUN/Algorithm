import java.io.IOException;
import java.util.Scanner;

public class Main {
    public void solution() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tmp = n -1;
        for (int i = 1; i< 2 * n; i++){
            if (i < n){
                System.out.println(" ".repeat(n - i)+"*".repeat(i));
            } else if (i == n){
                System.out.println("*".repeat(i));
            }else {
                System.out.println(" ".repeat(i-n)+"*".repeat(tmp));
                tmp--;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
