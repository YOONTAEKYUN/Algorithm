import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        List<String> sList = new ArrayList<String>();
        
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.equals("pop")) {
                if (sList.size() == 0) {
                    System.out.println("-1");
                }else{
                    System.out.println(sList.get(sList.size() - 1));
                    sList.remove(sList.size() - 1);
                }
            }else if (str.equals("size")) {
                System.out.println(sList.size());
            }else if (str.equals("empty")) {
                if (sList.size() == 0) {
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if (str.equals("top")) {
                if (sList.size() == 0) {
                    System.out.println("-1");
                }else{
                    System.out.println(sList.get(sList.size() - 1));
                }
            }else{
                String push = str.split(" ")[1];
                sList.add(push);
            }

        }
        br.close();
    }
}