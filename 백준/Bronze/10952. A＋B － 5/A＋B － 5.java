import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> result_list = new ArrayList<>();
        boolean isBreak = false;
        while(true){
            try {
                String[] str = br.readLine().split(" ");
                int result = 0;
                for(String s : str){
                    Integer st = Integer.parseInt(s);
                    if(st.equals(0)){
                        isBreak = true;
                    }else{
                        isBreak = false;
                    }
                    result += st;
                }
                if(isBreak == true){
                    break;
                }
                result_list.add(result);


            } catch (Exception e) {
                break;
            }
        }

        for(int res: result_list)System.out.println(res);
    
        br.close();
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
