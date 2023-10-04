import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String count = br.readLine();
        int input_count = Integer.parseInt(count);
        String[] result_list = br.readLine().split("");
        int result = 0;
        for (int i = 0; i< input_count; i++){
            result += Integer.parseInt(result_list[i]);
        }
        br.close();

        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
