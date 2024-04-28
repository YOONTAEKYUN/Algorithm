import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int fixK = K - 1;

        ArrayList<Integer> sequence = new ArrayList<>();

        for (int i = 1; i <= N; i++) { sequence.add(i); }
        sb.append("<");
        while (!sequence.isEmpty()) {
            sb.append(sequence.remove(K - 1));
            if (!sequence.isEmpty()) {
                sb.append(", ");
                K = (K + fixK) % sequence.size() == 0 ? sequence.size() : (K + fixK) % sequence.size();
            }
        }
        sb.append(">");

        System.out.println(sb);
        bw.close();
        br.close();
	}
}