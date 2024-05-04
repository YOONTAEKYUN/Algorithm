import java.io.*;
import java.util.HashMap;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] infix = br.readLine().split("");
        Stack<String> operator = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < infix.length; i++) {
            if (infix[i].equals("+") || infix[i].equals("-") || infix[i].equals("*") || infix[i].equals("/")) {
                while (!operator.isEmpty() &&  priority(operator.peek()) >= priority(infix[i])) {
                    sb.append(operator.pop());
                }
                operator.add(infix[i]);
            }else if(infix[i].equals("(")){
                operator.add("(");
            }else if(infix[i].equals(")")){
                while (operator.size() > 0 && operator.peek() != "(") {
                    sb.append(operator.pop());
                }
                operator.pop();
            }else{
                sb.append(infix[i]);
            }
        }
        
        while (!operator.isEmpty()) {
            sb.append(operator.pop());
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}

    private static int priority(String input) {
        int prior = -1;

        if (input.equals("*") || input.equals("/")) {
            return 2;
        }else if (input.equals("+") || input.equals("-")) {
            return 1;
        }else if (input.equals("(") || input.equals(")")) {
            return 0;
        }

        return prior;
    }
}

