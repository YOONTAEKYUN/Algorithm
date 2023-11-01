import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>(N);
        for (int i = 0 ; i< N; i++){
            String[] value = br.readLine().split(" ");
            ArrayList<Integer> val = new ArrayList<>(2);
            val.add(0, Integer.parseInt(value[0]));
            val.add(1, Integer.parseInt(value[1]));
            input.add(i,val);
        }

        input.sort((ArrayList<Integer> o1, ArrayList<Integer> o2)->{
                if (o1.get(0).compareTo(o2.get(0)) == 0){
                    return o1.get(1).compareTo(o2.get(1));
                } else {
                    return o1.get(0).compareTo(o2.get(0));
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