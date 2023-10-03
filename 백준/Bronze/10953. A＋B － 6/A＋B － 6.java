import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer case_count = Integer.parseInt(br.readLine());
        ArrayList<Integer> result_list = new ArrayList<>();

        for(int i =0; i< case_count; i++){
            String[] str = br.readLine().split(",");
            int result = 0;
            for(String s : str){
                Integer st = Integer.parseInt(s);
                result += st;
            }
            result_list.add(result);

        }
        
        for(int res: result_list)System.out.println(res);
    
        br.close();
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
