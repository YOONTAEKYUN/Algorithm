import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split("");

        for (int i = 0; i < input.length; i++) {
            char str = input[i].charAt(0);

            if (str>= 65 && str <= 90) {
                if (str + 13 > 90) {
                    str = (char) ((char) 64 + (str + 13 - 90) % 25) ;
                }else str += 13;
            }else if (str >= 97 && str <= 122) {
                if (str + 13 > 122) {
                    str = (char) ((char) 96 + (str + 13 - 122) % 25);
                }else str += 13;
            }
            sb.append(str);
        }
        
        System.out.print(sb);
        br.close();
	}
}

