import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            String[] input = br.readLine().split(" ");

            int[] arr = new int[Integer.parseInt(input[0])];

            long total = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(input[i + 1]);
            }

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    total += GCD(arr[i], arr[j]);
                }
            }
            bw.write(total + "\n");
        }


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