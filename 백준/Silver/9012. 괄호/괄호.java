import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        int lps = 0;
        int rps = 0;
        int ps = 0;

        for (int i = 0; i < T; i++) {
            lps = 0;
            rps = 0;
            ps = 0;
            
            String[] input = br.readLine().split("");

            for (int j = 0; j < input.length; j++) {
                if (ps == 0 ) {
                    if (input[j].equals("(")) {
                        lps += 1;
                        ps += 1;
                    }else{
                        rps += 1;
                        break;
                    }
                }else if (ps < 0) {
                    if (input[j].equals("(")) {
                        lps += 1;
                    }else{
                        rps += 1;
                    }
                    break;
                }
                else{
                    if (input[j].equals("(")) {
                        lps += 1;
                        ps += 1;
                    } else if (input[j].equals(")")) {
                        rps += 1;
                        ps -= 1;
                    }
                }
            }
        
            if (lps == rps & ps == 0) {
                result.append("YES");
            }else{
                result.append("NO");
            }
            result.append("\n");
        }
        System.out.println(result);

        br.close();

	}

}