import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(br.readLine());
        Integer b = Integer.parseInt(br.readLine());
        System.out.println(a + b);
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
