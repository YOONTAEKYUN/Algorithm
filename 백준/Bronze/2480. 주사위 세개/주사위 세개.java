import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] inputList = input.split(" ");

        int x = Integer.parseInt(inputList[0]);
        int y = Integer.parseInt(inputList[1]);
        int z = Integer.parseInt(inputList[2]);

        int prize = 0;

        if (x == y & y == z) {
            prize = 10000 + x * 1000;
        } else if (x == y) {
            prize = 1000 + x * 100;
        } else if (x == z) {
            prize = 1000 + x * 100;
        } else if (y == z) {
            prize = 1000 + y * 100;
        } else {
            prize = Math.max(x, Math.max(y, z)) * 100;
        }

        // System.out.print(out_h);
        // System.out.print(" ");
        // System.out.println(out_m);

        bw.write(prize + "\n");
        bw.flush();
        bw.close();

        br.close();
    }
}