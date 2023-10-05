import java.io.IOException;
import java.util.Scanner;

public class Main {
    public void solution() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tmp = n;

        for (int i = 1; i< 2 * n; i++){
            if (i < n){
                System.out.println("*".repeat(i)+" ".repeat(2 * tmp - 2)+"*".repeat(i));
            } else if (i == n){
                System.out.println("*".repeat(2*n));
            }else {
                System.out.println("*".repeat(2*n-i)+" ".repeat(2*(i-n) )+"*".repeat(n + tmp - 1));
            }
            tmp --;
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
