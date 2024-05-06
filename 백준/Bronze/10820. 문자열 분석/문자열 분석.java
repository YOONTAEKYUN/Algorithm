import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        String in;

        while((in = br.readLine()) != null) {
            String[] input = in.split("");

            int lowercase = 0;
            int uppercase = 0;
            int blank = 0;
            int num = 0;

            for (int i = 0; i < input.length; i++) {
                if (input[i].charAt(0) >= 65 && input[i].charAt(0) <= 90) {
                    uppercase += 1;
                }else if (input[i].charAt(0) >= 97 && input[i].charAt(0) <= 122) {
                    lowercase += 1;
                }else if (input[i].charAt(0) >= 48 && input[i].charAt(0) <= 57) {
                    num += 1;
                }else{
                    blank += 1;
                }
            }
            sb.append(lowercase + " " + uppercase + " " + num + " " + blank + "\n");
        }
        System.out.print(sb);
        br.close();
	}
}

