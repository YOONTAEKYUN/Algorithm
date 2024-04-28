import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> textQueue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String order = br.readLine();

            if (order.contains("push")) {
                int value = Integer.parseInt(order.substring(5));
                textQueue.add(value);
            } else if (order.contains("pop")) {
                if (!textQueue.isEmpty()) {
                    System.out.println(textQueue.poll());
                } else {
                    System.out.println("-1");
                }
            } else if (order.contains("size")) {
                System.out.println(textQueue.size());
            } else if (order.contains("empty")) {
                if (textQueue.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (order.contains("front")) {
                if (!textQueue.isEmpty()) {
                    System.out.println(textQueue.peek());
                } else {
                    System.out.println("-1");
                }
            } else if (order.contains("back")) {
                if (!textQueue.isEmpty()) {
                    int lastElement = 0;
                    for (int element : textQueue) {
                        lastElement = element;
                    }
                    System.out.println(lastElement);
                } else {
                    System.out.println("-1");
                }
            }
        }

        br.close();
    }
}
