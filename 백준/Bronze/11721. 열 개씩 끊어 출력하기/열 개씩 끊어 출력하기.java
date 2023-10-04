import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        for (int i = 0; i< input.length(); i+=10){
            if ((input.length() - i) <10 ){
                System.out.println(input.substring(i, input.length()));
            }else {
                System.out.println(input.substring(i,i+10));
            }
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
