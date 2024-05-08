import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String input[] = br.readLine().split(" ");
        int[] greatestCommonDivisor = new int[Integer.parseInt(input[0])];
        int idx = 0;
        int gcd = 1;

        for (int i = 1; i <= Integer.parseInt(input[0]); i++) {
            if (Integer.parseInt(input[0]) % i == 0) {
                greatestCommonDivisor[idx] = i;
                idx ++;
            }
        }

        for (int i = 0; i < idx; i++) {
            if (Integer.parseInt(input[1]) % greatestCommonDivisor[i] == 0) {
                gcd = greatestCommonDivisor[i];
            }
        }
        sb.append(gcd + "\n");


        for (int i = 1;; i++) {
            if (Integer.parseInt(input[0]) * i % Integer.parseInt(input[1]) == 0) {
                sb.append(Integer.parseInt(input[0]) * i);
                break;
            }
        }
        System.out.println(sb);
        br.close();
	}
}

