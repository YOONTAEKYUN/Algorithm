import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp_in;
    static int[] dp_de;
    static int[] dp_by;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //dp_in]i] : i번째 까지의 수열 중 i를 포함하는 가장 긴 증가하는 부분 수열의 길이
        //dp_de]i] : i번째 까지의 수열 중 i로 시작하는 가장 긴 감소하는 부분 수열의 길이
        //dp_by[i] : i번째 위치의 값이 가장 큰 바이토닉 수열의 길이 : dp_in[i] + dp_de[i]
        dp_in = new int[N + 1];
        dp_de = new int[N + 1];
        dp_by = new int[N + 1];

        String[] input = br.readLine().split(" ");
        int[] inputInt = new int[N + 1];

        for (int i = 1; i<= N; i++){
            inputInt[i] = Integer.parseInt(input[i-1]);
            dp_in[1] = 1;
            int[] candidate_in = new int[N+1];
            int max = 0;
            if (i > 1){
                for (int j = 1; j < i; j++){
                    if (inputInt[i] > inputInt[j] ){
                        candidate_in[j] = dp_in[j];
                    }
                }
                for (int j = 1; j< i; j++){
                    max = Math.max(max, candidate_in[j]);
                }
                dp_in[i] = max + 1;
            }
        }
        //dp_de[i]
        for (int i = N; i> 0; i--){
            int[] candidate_de = new int[N+1];
            int min = 0;
            dp_de[N] = 1;
            if (i < N){
                for (int j = N; j > i; j--){
                    if (inputInt[i] > inputInt[j]){
                        candidate_de[j] = dp_de[j];
                    }
                }
                for (int j = N; j> i; j--){
                    min = Math.max(min, candidate_de[j]);
                }
                dp_de[i] = min + 1;
            }
        }

//        for (int i = 1; i<= N; i++){
//            System.out.print(dp_in[i] + " ");
//        }
//        System.out.println();
//        for (int i = 1; i<= N; i++){
//            System.out.print(dp_de[i] + " ");
//        }
//        System.out.println();

        int max = 0;
        for (int i = 1; i <= N; i++){
            dp_by[i] = dp_in[i] + dp_de[i];
            max = Math.max(max, dp_by[i]);
        }
//        for (int i = 1; i<= N; i++){
//            System.out.print(dp_by[i] + " ");
//        }
//        System.out.println();
        System.out.println(max - 1);

        br.close();
    }
}