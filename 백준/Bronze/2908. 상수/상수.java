import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] AB = br.readLine().split(" ");
        StringBuffer Asb = new StringBuffer(AB[0]).reverse();
        StringBuffer Bsb = new StringBuffer(AB[1]).reverse();

        System.out.println(Math.max(Integer.parseInt(Asb.toString()), Integer.parseInt(Bsb.toString())));

        br.close();
    }
}