import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int input;
        int maxInput = 0;
        ArrayList<Integer> numList = new ArrayList<>();
        while((input = Integer.parseInt(br.readLine())) != 0){
            numList.add(input);
            maxInput = Math.max(maxInput, input);
        }


        boolean[] isPrime = new boolean[maxInput];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i*i < maxInput; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j < maxInput; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        int check = 0;
        for (Integer integer : numList) {
            for (int j = 2; j * j < maxInput; j++) {
                if (isPrime[j] && isPrime[integer - j]) {
                    sb.append(integer)
                            .append(" = ")
                            .append(j)
                            .append(" + ")
                            .append(integer - j)
                            .append("\n");
                    check = 1;
                    break;
                }
            }
            if (check == 0) sb.append("Goldbach's conjecture is wrong.");
            else check = 0;
        }
        System.out.println(sb);
        br.close();
    }
}

