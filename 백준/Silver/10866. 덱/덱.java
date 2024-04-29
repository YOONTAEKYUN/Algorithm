import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            String order = br.readLine();

            if (order.contains("push_front")) {
                deque.addFirst(Integer.parseInt(order.split(" ")[1]));
            }else if (order.contains("push_back")) {
                deque.addLast(Integer.parseInt(order.split(" ")[1]));
            }else if (order.contains("pop_front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.removeFirst());
                }else{
                    System.out.println("-1");
                }
            }else if (order.contains("pop_back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.removeLast());
                }else{
                    System.out.println("-1");
                }
            }else if (order.contains("size")) {
                System.out.println(deque.size());
            }else if (order.contains("empty")) {
                if (!deque.isEmpty()) {
                    System.out.println("0");
                }else{
                    System.out.println("1");
                }
            }else if (order.contains("front")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.getFirst());
                }else{
                    System.out.println("-1");
                }
            }else if (order.contains("back")) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.getLast());
                }else{
                    System.out.println("-1");
                }
            }
        }
        br.close();
	}
}

