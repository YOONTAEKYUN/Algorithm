import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int totalPrice = Integer.parseInt(br.readLine());
        int totalCount = Integer.parseInt(br.readLine());

        int getPrice = 0;
        for (int i = 0 ; i< totalCount; i++){
            String[] input = br.readLine().split(" ");
            int price = Integer.parseInt(input[0]);
            int count = Integer.parseInt(input[1]);
            getPrice += (price * count);
        }
        br.close();

        if (getPrice == totalPrice){
            sb.append("Yes");
        }else {
            sb.append("No");
        }
        System.out.println(sb);
    }
}