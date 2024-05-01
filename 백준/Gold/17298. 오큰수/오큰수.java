import java.io.*;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] A = br.readLine().split(" ");
        Integer[] result = new Integer[A.length];

        Stack<Integer> stack = new Stack<>();

        stack.add(0);
        for (int i = 1; i < N; i++) {
            while (!stack.isEmpty() && Integer.parseInt(A[stack.peek()]) < Integer.parseInt(A[i])) {
                result[stack.peek()] = Integer.parseInt(A[i]);
                stack.pop();

            }
            stack.add(i);
        }

        while(!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb);
        br.close();
	}
}

