import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int result = Integer.parseInt(br.readLine());

        int count = 0;
        while (result >= 5) {
            count += result / 5;
            result /= 5;
        }
        System.out.println(count);
        br.close();
    }
}