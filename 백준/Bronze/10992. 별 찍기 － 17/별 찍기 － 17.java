import java.io.IOException;
import java.util.Scanner;

public class Main {
    public void solution() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i< n+1; i++) {
            if (i == n){
                System.out.print("*".repeat(2*n-1));
            }else if (i == 1){
                System.out.print(" ".repeat(n-i)+"*");
            }
            else {
                System.out.print(" ".repeat(n-i)+"*"+" ".repeat(2*(i-1)-1)+"*" );
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
