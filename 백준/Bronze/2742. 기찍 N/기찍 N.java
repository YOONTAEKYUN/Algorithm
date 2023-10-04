import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        for (int i = n; i > 0; i--){
            System.out.println(i);
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
