import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] input = br.readLine().split(" ");
        int N5 = Integer.parseInt(input[0]);
        int M5 = Integer.parseInt(input[1]);
        int NM5 = N5 - M5;

        int N2 = N5;
        int M2 = M5;
        int NM2 = NM5;

        int N5count = 0;
        int M5count = 0;
        int NM5count = 0;

        int N2count = 0;
        int M2count = 0;
        int NM2count = 0;

        while (N5 >= 5) {
            N5count += N5 / 5;
            N5 /= 5;
        }

        while (M5 >= 5) {
            M5count += M5 / 5;
            M5 /= 5;
        }

        while (NM5 >= 5) {
            NM5count += NM5 / 5;
            NM5 /= 5;
        }

        while (N2 >= 2) {
            N2count += N2 / 2;
            N2 /= 2;
        }

        while (M2 >= 2) {
            M2count += M2 / 2;
            M2 /= 2;
        }

        while (NM2 >= 2) {
            NM2count += NM2 / 2;
            NM2 /= 2;
        }

        int result = Math.min(N2count - M2count - NM2count, N5count - M5count - NM5count);
        System.out.println(result);
        br.close();
    }
}