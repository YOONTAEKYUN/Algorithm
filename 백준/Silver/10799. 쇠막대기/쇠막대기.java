import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pipe = br.readLine();

        int lb = 0;
        int brokenPipe = 0;

        for (int i = 0; i < pipe.length(); i++) {
            if (pipe.charAt(i) == '(') {
                lb += 1;
            }else{
                if (pipe.charAt(i - 1) == '(') {
                    lb -= 1;
                    brokenPipe += lb;
                }else{
                    brokenPipe += 1;
                    lb -= 1;
                }
            }
        }
        System.out.println(brokenPipe);

        br.close();
	}
}