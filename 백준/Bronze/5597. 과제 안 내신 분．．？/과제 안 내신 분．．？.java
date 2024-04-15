import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] attendance = new int[31];
        Arrays.fill(attendance, 0);
        attendance[0] = 1;

        for (int i = 0; i < 28; i++) {
            int check = Integer.parseInt(br.readLine());
            attendance[check] = 1;
        }

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == 0) {
                System.out.println(i);
            }
        }
        br.close();
    }
}