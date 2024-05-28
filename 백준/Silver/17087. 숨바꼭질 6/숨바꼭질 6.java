import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        String[] A = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(S - Integer.parseInt(A[i]));
        }
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = GCD(result, arr[i]);
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
    private static int GCD(int i, int j) {
        int a = Math.max(i,j);
        int b = Math.min(i,j);
        if (a % b == 0){
            return b;
        }else{
            return GCD(b, a%b);
        }
    }
}