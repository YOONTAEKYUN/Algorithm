import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("");
        int l = input.length;
        Stack<Integer> stackInput = new Stack<>();
        Arrays.stream(input).map(Integer::parseInt).forEach(stackInput::push);

        int idx = 0;

        Stack<Integer> result = new Stack<>();
        int total = 0;
        while(!stackInput.empty()){
            if (stackInput.size() == 1){
                if (idx < 2) {
                    if (stackInput.pop() == 1) {
                        total += (int) Math.pow(2, idx);
                    }
                } else if (idx == 2) {
                    if (stackInput.pop() == 1) {
                        total += (int) Math.pow(2, idx);
                    }
                }
                result.push(total);
            }else{
                if(idx < 2) {
                    if (stackInput.pop() == 1) {
                        total += (int) Math.pow(2, idx);
                    }
                    idx ++;
                }else if (idx == 2){
                    if (stackInput.pop() == 1) {
                        total += (int) Math.pow(2, idx);
                    }
                    idx = 0;
                    result.push(total);
                    total = 0;
                }
            }
        }
        while(!result.empty()){
            bw.write(result.pop()+"");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}