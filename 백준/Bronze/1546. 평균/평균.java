import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double subject_num = Double.parseDouble(br.readLine());
        String[] scoreList = br.readLine().split(" ");
        double max_grade = 0.00;
        double sum = 0.00;

        for (int i = 0; i < scoreList.length; i++) {
            max_grade = Math.max(max_grade, Integer.parseInt(scoreList[i]));
        }
        for (int i = 0; i < scoreList.length; i++) {
            double tmp = Double.parseDouble(scoreList[i]);
            scoreList[i] = String.valueOf(tmp / max_grade * 100.00);
        }

        for (String score : scoreList) {
            sum += Double.parseDouble(score);
        }

        System.out.println(sum / subject_num);

        br.close();
    }
}