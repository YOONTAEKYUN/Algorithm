import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int[] basket = new int[N + 1];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i;
        }

        for (int a = 0; a < M; a++) {
            String[] input = br.readLine().split(" ");

            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);

            for (int b = 0; (j - i) / 2 >= b; b++) {
                int tmp = basket[i + b];
                basket[i + b] = basket[j - b];
                basket[j - b] = tmp;
            }
        }

        for (int idx = 1; idx < basket.length; idx++) {
            System.out.print(basket[idx] + " ");
        }
        System.out.println();
        br.close();
    }
}