import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> input = new ArrayList<>(N);
        for (int i = 0 ; i< N; i++){
            input.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(input);
        for (int i =0; i< N; i++){
            bw.write(String.valueOf(input.get(i))+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}