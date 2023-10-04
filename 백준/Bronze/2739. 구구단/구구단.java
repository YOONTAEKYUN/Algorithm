import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        for (int i = 1; i < 10; i++){
            System.out.println(input + " * " + String.valueOf(i) + " = " + String.valueOf(n*i));
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
