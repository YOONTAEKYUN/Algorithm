import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_count = Integer.parseInt(br.readLine());
        int[][] val_list = new int[case_count][2];
        ArrayList<Integer> result_list = new ArrayList<>();

        for(int i =0; i< case_count; i++){
            String[] str = br.readLine().split(" ");
            int result = 0;
            int[] val = new int[2];
            for(int j = 0; j< 2; j++){
                int st = Integer.parseInt(str[j]);
                result += st;
                val[j] = st;
            }
            val_list[i] = val;
            result_list.add(result);

        }

        for(int i = 0; i<case_count; i++){
            System.out.println("Case #" + (i+1)+": " + Integer.toString(val_list[i][0]) + " + "
                    + Integer.toString(val_list[i][1]) + " = " + Integer.toString(result_list.get(i)));
        }
        br.close();
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
