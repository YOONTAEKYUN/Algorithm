import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());
        int yun = -1;
        if (year % 400 == 0) {
            yun = 1;
        } else if (year % 4 == 0 & year % 100 != 0) {
            yun = 1;
        } else {
            yun = 0;
        }
        System.out.println(yun);

        br.close();
    }
}