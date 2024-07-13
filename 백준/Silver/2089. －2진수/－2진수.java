import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        br.close();
        Stack<Integer> repo = new Stack<>();

        if (input == 0) {
            System.out.println(0);
            return;
        }       
        while(input != 0){
            int quotient = input / -2;
            int remainder = input % -2;
            if(remainder < 0){
                quotient += 1;
                remainder = 1;
            }
            repo.push(remainder);
            input = quotient;
        }

        while(!repo.empty()){
            System.out.print(repo.pop());
        }

    }
}
