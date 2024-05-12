import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int result = Integer.parseInt(br.readLine());

        if (result == 0) sb.append(1);
        else {
            for (int i = result - 1; i > 0; i--) {
                result *= i;
            }
            sb.append(result);
            
        }

        System.out.println(sb);
        br.close();
    }
}