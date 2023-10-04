import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer case_count = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int MinResult = Integer.parseInt(str[0]);
        int MaxResult = Integer.parseInt(str[0]);
        for(String s : str){
            int st = Integer.parseInt(s);
            if(MinResult > st){
                MinResult = st;
            }
            if(MaxResult < st){
                MaxResult = st;
            }
        }
        System.out.println(String.valueOf(MinResult) + " " + String.valueOf(MaxResult));

        br.close();
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
