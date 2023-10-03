import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer test_case_count = Integer.parseInt(br.readLine());
        ArrayList<Integer> result_list = new ArrayList<>();
        
        for(int i =0; i< test_case_count; i++){
            String[] str = br.readLine().split(" ");
            int result = 0;
            for(String s : str)result += Integer.parseInt(s);
            result_list.add(result);        
        };
        for(int res: result_list)System.out.println(res);
    
        br.close();
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
