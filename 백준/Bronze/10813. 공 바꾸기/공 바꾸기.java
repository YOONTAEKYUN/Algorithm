import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int[] basket = new int[N + 1];
        for (int i = 1; i < basket.length; i++) {
            basket[i] = i;
        }

        for (int a = 0; a < M; a++) {
            String[] input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);

            int tmp = basket[i];
            basket[i] = basket[j];
            basket[j] = tmp;
        }

        for (int i = 1; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
        System.out.println();

        br.close();
    }
}