import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(calculateEnd(N));
        // bw.write("\n");
        // bw.flush();
        // bw.close();

        br.close();
    }

    private static int calculateEnd(int N) {
        int currentN = 1;
        int addNum = 0;

        String end = "666";
        int result = 0;

        while (true) {
            String addString = String.valueOf(addNum);
            // System.out.println("- addString: " + addString);

            if (addString.contains("666")) {
                for (int i = 0; i < 1000; i++) {
                    if (i < 10) {
                        result = Integer.parseInt(addString.concat("00").concat(String.valueOf(i)));
                    } else if (i < 100) {
                        result = Integer.parseInt(addString.concat("0").concat(String.valueOf(i)));
                    } else {
                        result = Integer.parseInt(addString.concat(String.valueOf(i)));
                    }

                    // System.out.print("result: " + result);
                    // System.out.println(" currentN: " + currentN);

                    if (currentN == N) {
                        return result;
                    }
                    currentN++;
                }
                addNum++;
            } else if (addString.endsWith("66")) {
                for (int i = 0; i < 100; i++) {
                    if (i < 10) {
                        result = Integer.parseInt(addString.concat("60").concat(String.valueOf(i)));
                    } else {
                        result = Integer.parseInt(addString.concat("6").concat(String.valueOf(i)));
                    }

                    // System.out.print("result: " + result);
                    // System.out.println(" currentN: " + currentN);

                    if (currentN == N) {
                        return result;
                    }
                    currentN++;
                }
                addNum++;
            } else if (addString.endsWith("6")) {
                for (int i = 0; i < 10; i++) {
                    result = Integer.parseInt(addString.concat("66").concat(String.valueOf(i)));

                    // System.out.print("result: " + result);
                    // System.out.println(" currentN: " + currentN);

                    if (currentN == N) {
                        return result;
                    }
                    currentN++;
                }
                addNum++;
            } else {
                result = Integer.parseInt(addString.concat(end));
                // System.out.print("result: " + result);
                // System.out.println(" currentN: " + currentN);
                if (currentN == N) {
                    return result;
                }
                currentN++;
                addNum++;
            }
        }
    }
}