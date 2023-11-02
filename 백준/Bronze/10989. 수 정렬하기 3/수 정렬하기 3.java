import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] value = new int[N];
        for (int i = 0 ; i< N; i++){
            value[i] =Integer.parseInt(br.readLine());
        }
        Arrays.sort(value);

        for (int i =0; i< N; i++){
            bw.write(value[i] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}