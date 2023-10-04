import java.io.*;


public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String StrInput = br.readLine();
        int input = Integer.parseInt(StrInput);
        int result = 0;

        for (int i = 1; i<input+1; i++){
            result += i;
        }
        System.out.println(result);

        br.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
