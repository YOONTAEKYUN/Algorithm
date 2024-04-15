import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> modulo = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            modulo.add(input % 42);
        }

        System.out.println(modulo.size());
        br.close();
    }
}