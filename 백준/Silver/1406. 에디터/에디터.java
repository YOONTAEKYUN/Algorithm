import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = br.readLine();
        Stack<String> mainStack = new Stack<>();
        Stack<String> subStack = new Stack<>();

        for (String string : text.split("")) {
            mainStack.add(string);
        }

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String order = br.readLine();
            if (order.contains("P")) {
                mainStack.push(order.split(" ")[1]);
            }else if(order.contains("L")){
                if (!mainStack.isEmpty()) {
                    subStack.push(mainStack.pop());
                }
            }else if(order.contains("D")){
                if (!subStack.isEmpty()) {
                    mainStack.push(subStack.pop());
                }
            }else if(order.contains("B")){
                if (!mainStack.isEmpty()) {
                    mainStack.pop();
                }
            }
        }
        
        while (!mainStack.isEmpty()) {
            subStack.push(mainStack.pop());
        }

        while (!subStack.isEmpty()) {
            bw.write(subStack.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}