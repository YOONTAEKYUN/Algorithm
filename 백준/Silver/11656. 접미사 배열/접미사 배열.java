import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String input = br.readLine();

        String[] suffix = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            suffix[i] = input.substring(i);
        }

        Arrays.sort(suffix);
        
        for (int i = 0; i < suffix.length; i++) {
            sb.append(suffix[i]).append("\n");
        }
        
        System.out.println(sb);
        br.close();
	}
}

