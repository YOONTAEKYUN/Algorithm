import java.io.*;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> checkStack = new Stack<>();

        for (int i = n; i > 0; i--) {
            checkStack.add(i);
        }
        
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (stack.isEmpty()) {
                stack.add(checkStack.lastElement());
                checkStack.pop();
                sb.append("+\n");
            }

            while (num != stack.lastElement()) {
                if (stack.size() < 2) {
                    stack.add(checkStack.lastElement());
                    checkStack.pop();
                    sb.append("+\n");
                }else{
                    if (num <  stack.get(stack.size() - 1)) {
                        sb.append("false");
                        break;
                    }else{
                        stack.add(checkStack.lastElement());
                        checkStack.pop();
                        sb.append("+\n");
                    }
                }
            }
            if (sb.indexOf("false") != -1) {
                break;
            }
            sb.append("-\n");
            stack.pop();
        }

        if (sb.indexOf("false") >= 0) {
            System.out.println("NO");
        }else{
            System.out.println(sb);
        }
        br.close();
	}
}