import java.util.Scanner;

public class Main {
    public void solution() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i< n + 1; i++){
            System.out.println(" ".repeat(n-i)+"*".repeat(2*i-1));
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
