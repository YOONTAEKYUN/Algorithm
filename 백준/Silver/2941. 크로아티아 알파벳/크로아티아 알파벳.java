import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int cnt = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.contains("c=")) {
                cnt += 1;
                input = input.replaceFirst("c=", "  ");

            }
            if (input.contains("c-")) {
                cnt += 1;
                input = input.replaceFirst("c-", "  ");

            }
            if (input.contains("dz=")) {
                cnt += 1;
                input = input.replaceFirst("dz=", "   ");

            } else if (input.contains("z=")) {
                cnt += 1;
                input = input.replaceFirst("z=", "  ");
            }
            if (input.contains("d-")) {
                cnt += 1;
                input = input.replaceFirst("d-", "  ");
            }
            if (input.contains("lj")) {
                cnt += 1;
                input = input.replaceFirst("lj", "  ");
            }
            if (input.contains("nj")) {
                cnt += 1;
                input = input.replaceFirst("nj", "  ");
            }
            if (input.contains("s=")) {
                cnt += 1;
                input = input.replaceFirst("s=", "  ");
            }
        }


        if (input.contains(" ")) {
            input = input.replace(" ", "");
        }
        if (input.contains("  ")) {
            input = input.replace(" ", "");
        }
        if (input.contains("-")) {
            input = input.replace("-", "");
        }
        if (input.contains("=")) {
            input = input.replace("=", "");
        }

        int restCnt = input.length();

        System.out.println(restCnt + cnt);
        br.close();
    }
}