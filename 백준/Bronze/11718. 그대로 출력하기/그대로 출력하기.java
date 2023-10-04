import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> result_list = new ArrayList<>();
        String val = br.readLine();
        if (val != null) {
            result_list.add(val);
        }
        while((val =br.readLine()) != null){
            result_list.add(val);
        }
        br.close();

        for (String result: result_list) System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
