import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input =br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        char[] overN = new char[26];
        for (int i = 0; i < overN.length; i++) {
            overN[i] = (char) (i + 65);
        }
        Stack<String> result = new Stack<>();
        while (true) {
            int share = N / B;
            int remainder = N % B;
            
            if (remainder >= 10) {
                result.add(String.valueOf(overN[remainder - 10]));
            }else{
                result.add(String.valueOf(remainder));
            }
            if (share == 0) {
                break;
            }
            N /= B;
        }
        
        while (!result.empty()) {
            System.out.print(result.pop());
        }
    }
}
