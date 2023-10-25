import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String> results = new ArrayList<>();
        
        int n = Integer.parseInt(br.readLine());

        move(1, 3, 2, n, results);

        bw.write(Integer.toString(results.size()));
        bw.newLine();

        for(int i =0; i < results.size(); i++){
            bw.write(results.get(i));
            bw.newLine();
        }
        bw.close();
        br.close();

    }

    private static void move(int src, int dest, int temp, int n, ArrayList<String> results) throws IOException{
        

        if(n == 1){
            results.add(src + " " + dest);
        }
        else{

            move(src, temp, dest, n-1, results);
            results.add(src + " " + dest);

            move(temp, dest, src, n-1, results);

        }
    }
}