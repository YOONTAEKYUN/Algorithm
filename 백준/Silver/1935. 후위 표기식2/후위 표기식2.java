import java.io.*;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    //65 A  97 a
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] expression = br.readLine().split("");
        Stack<Double> inputStack = new Stack<Double>();
        double[] inputList = new double[N];


        for (int i = 0; i < N; i++) {
            inputList[i] = Double.parseDouble(br.readLine());
        }


        for (int i = 0; i < expression.length; i++) {
            if (expression[i].equals("+")) {
                double x = inputStack.pop();
                double y = inputStack.pop();
                inputStack.add(y + x);
            }else if (expression[i].equals("-")) {
                double x = inputStack.pop();
                double y = inputStack.pop();
                inputStack.add(y - x);
            }else if (expression[i].equals("/")) {
                double x = inputStack.pop();
                double y = inputStack.pop();
                inputStack.add(y / x);
            }else if (expression[i].equals("*")) {
                double x = inputStack.pop();
                double y = inputStack.pop();
                inputStack.add(y * x);
            }else{
                inputStack.add(inputList[expression[i].charAt(0) - 'A']);
            }
        }
        bw.write(String.valueOf(String.format("%.2f", inputStack.pop())));
        bw.flush();
        bw.close();
        br.close();
	}
}

