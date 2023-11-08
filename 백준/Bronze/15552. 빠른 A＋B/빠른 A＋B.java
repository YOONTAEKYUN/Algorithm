import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int  N = Integer.parseInt(br.readLine());
        int[] result = new int[N];
        for (int i = 0; i< N; i++){
            String[] input = br.readLine().split(" ");
            result[i] = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
        }
        for (int res: result){
            bw.write(res + "\n");
        }
        bw.flush();
        br.close();
    }
}