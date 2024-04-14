import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int out_h = 0;
        int out_m = 0;

        String input = br.readLine();
        String[] inputList = input.split(" ");

        int input_time = Integer.parseInt(br.readLine());

        int h = Integer.parseInt(inputList[0]);
        int m = Integer.parseInt(inputList[1]);

        int add_h = input_time / 60;
        int add_m = input_time % 60;

        if (add_m + m >= 60) {
            out_h = h + add_h + 1;
            if (out_h >= 24) {
                int temp = out_h;
                out_h = temp - 24;
            }
            out_m = m + add_m - 60;
        } else {
            out_h = h + add_h;
            if (out_h >= 24) {
                int temp = out_h;
                out_h = temp - 24;
            }
            out_m = m + add_m;
        }

        System.out.print(out_h);
        System.out.print(" ");
        System.out.println(out_m);

        br.close();
    }
}