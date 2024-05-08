import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");

        sb.append(Long.parseLong(input[0]+input[1]) + Long.parseLong(input[2]+input[3]));
        System.out.println(sb);
        br.close();
	}
}

