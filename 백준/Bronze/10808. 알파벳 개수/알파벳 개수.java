import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split("");
        int[] az = new int[26];
        Arrays.fill(az, 0);

        for (int i = 0; i < input.length; i++) {
            az[input[i].charAt(0) - 'a'] += 1;
        }

        for (int i = 0; i < az.length; i++) {
            bw.write(az[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
	}
}