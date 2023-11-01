import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<String>> input = new ArrayList<ArrayList<String>>(N);
        for (int i = 0 ; i< N; i++){
            String[] value = br.readLine().split(" ");
            ArrayList<String> val = new ArrayList<>(3);
            val.add(0, (value[0]));
            val.add(1, (value[1]));
            val.add(2,String.valueOf(i));
            input.add(i,val);
        }

        input.sort((ArrayList<String> o1, ArrayList<String> o2)->{
                if (Integer.compare(Integer.parseInt(o1.get(0)), Integer.parseInt(o2.get(0))) == 0){
                    return Integer.compare(Integer.parseInt(o1.get(2)), Integer.parseInt(o2.get(2)));
                } else {
                    return Integer.compare(Integer.parseInt(o1.get(0)), Integer.parseInt(o2.get(0)));
                }
            }
        );

        for (int i =0; i< N; i++){
            bw.write(input.get(i).get(0)+" "+input.get(i).get(1)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}