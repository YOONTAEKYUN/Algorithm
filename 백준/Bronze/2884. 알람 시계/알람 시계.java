import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int out_h = 0;
        int out_m = 0;

        String input = br.readLine();
        String[] inputList = input.split(" ");

        int h = Integer.parseInt(inputList[0]);
        int m = Integer.parseInt(inputList[1]);

        if (m - 45 >= 0) {
            out_h = h;
            out_m = m - 45;
        } else {
            if (h == 0) {
                out_h = 24 - 1;
            } else {
                out_h = h - 1;
            }
            out_m = 60 + (m - 45);
        }

        System.out.print(out_h);
        System.out.print(" ");
        System.out.println(out_m);

        br.close();
    }
}