import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int dpR = 0;
        int dpG = 0;
        int dpB = 0;
        int r; int g; int b;

        for (int i = 1; i <= n; i++){
            String[] input = br.readLine().split(" ");
            r = Integer.parseInt(input[0]);
            g = Integer.parseInt(input[1]);
            b = Integer.parseInt(input[2]);

            if (i == 1){
                dpR = r;
                dpG = g;
                dpB = b;
            }else {
                int tmp_dpR = Math.min(dpG,dpB);
                int tmp_dpG = Math.min(dpR,dpB);
                int tmp_dpB = Math.min(dpR,dpG);
                dpR = tmp_dpR + r;
                dpG = tmp_dpG + g;
                dpB = tmp_dpB + b;
            }
        }

        System.out.println(Math.min(Math.min(dpR,dpG),dpB));
        br.close();

    }
}
