import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];

        for (int i = 0; i < n; i++){
            int colNum = Integer.parseInt(br.readLine());
            int[] dp0 = new int[colNum]; int[] dp1 = new int[colNum];
            int[][]  stickerSet = new int[2][colNum];
            for (int j = 0; j < 2; j++){
                String[] input = br.readLine().split(" ");
                for (int k = 0; k < colNum; k++){
                    stickerSet[j][k] = Integer.parseInt(input[k]);
                    if (j == 1){
                        if (k == 0){
                            dp0[k] = stickerSet[0][k];
                            dp1[k] = stickerSet[1][k];
                        } else if (k == 1){
                            dp0[k] = dp1[k-1] + stickerSet[0][k]; dp1[k] = dp0[k-1] + stickerSet[1][k];
                        } else {
                            dp0[k] = Math.max(dp1[k-2], dp1[k-1]) + stickerSet[0][k];
                            dp1[k] = Math.max(dp0[k-2], dp0[k-1]) + stickerSet[1][k];
                        }
                    }
                }
            }
            result[i] =(Math.max(dp0[colNum-1],dp1[colNum-1]));
        }
        for (int i = 0; i< n; i++){
            System.out.println(result[i]);
        }
        br.close();
    }
}