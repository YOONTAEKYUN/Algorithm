import java.io.*;
import java.util.HashMap;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        String[] A = br.readLine().split(" ");
        int[] B =  new int[A.length];

        Integer[] result = new Integer[A.length];

        //해쉬맵에 같은 값이면 value +=1 해서 정하고, 
        HashMap<String, Integer> countHashMap = new HashMap<>();
        for (int i = N - 1; i >= 0; i--) {
            if (countHashMap.get(A[i]) == null) {
                countHashMap.put(A[i], 0);
            }
            countHashMap.put(A[i], countHashMap.get(A[i]) + 1);
        }

        for (int i = 0; i < N; i++) {
            B[i] = countHashMap.get(A[i]);
        }
        Stack<Integer> stack = new Stack<>();

        stack.add(0);
        for (int i = 1; i < N; i++) {
            while (!stack.isEmpty() && B[stack.peek()] < B[i]) {
                result[stack.peek()] = Integer.parseInt(A[i]);
                stack.pop();

            }
            stack.add(i);
        }

        while(!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for (int i = 0; i < N; i++) {
            bw.append(String.valueOf(result[i]) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
	}
}

