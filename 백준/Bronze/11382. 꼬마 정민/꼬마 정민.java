import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        System.out.println(Long.parseLong(input[0])+Long.parseLong(input[1])+Long.parseLong(input[2]));
        br.close();
    }

}