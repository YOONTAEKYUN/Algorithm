import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = (br.readLine().split(" "));

        System.out.print(1 - Integer.parseInt(input[0]) + " ");
        System.out.print(1 - Integer.parseInt(input[1]) + " ");
        System.out.print(2 - Integer.parseInt(input[2]) + " ");
        System.out.print(2 - Integer.parseInt(input[3]) + " ");
        System.out.print(2 - Integer.parseInt(input[4]) + " ");
        System.out.println(8 - Integer.parseInt(input[5]));

        br.close();
    }
}