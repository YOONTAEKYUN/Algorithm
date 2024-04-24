import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            while (input.contains("()")) {
                input = input.replace("()", "");
            }
            sb.append(input.equals("")? "YES\n" : "NO\n");
        }
       
        System.out.println(sb);
        br.close();
	}
}