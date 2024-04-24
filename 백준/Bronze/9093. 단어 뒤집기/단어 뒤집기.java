import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                StringBuffer sb = new StringBuffer();
                sb.append(input[j]);
                sb.reverse();
                input[j] = sb.toString();
                result.append(input[j] + " ");
            }
            result.append("\n");
        }
        System.out.println(result);

        br.close();

	}

}
