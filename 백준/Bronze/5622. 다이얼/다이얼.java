import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        char[] two = { 'A', 'B', 'C' };
        char[] three = { 'D', 'E', 'F' };
        char[] four = { 'G', 'H', 'I' };
        char[] five = { 'J', 'K', 'L' };
        char[] six = { 'M', 'N', 'O' };
        char[] seven = { 'P', 'Q', 'R', 'S' };
        char[] eight = { 'T', 'U', 'V' };
        char[] nine = { 'W', 'X', 'Y', 'Z' };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");
        int[] inputNum = new int[input.length];
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == "1") {
                inputNum[i] = 2;
            }
            for (char ch : two) {
                if (ch == input[i].charAt(0)) {
                    inputNum[i] = 3;
                }
            }
            for (char ch : three) {
                if (ch == input[i].charAt(0)) {
                    inputNum[i] = 4;
                }
            }
            for (char ch : four) {
                if (ch == input[i].charAt(0)) {
                    inputNum[i] = 5;
                }
            }
            for (char ch : five) {
                if (ch == input[i].charAt(0)) {
                    inputNum[i] = 6;
                }
            }
            for (char ch : six) {
                if (ch == input[i].charAt(0)) {
                    inputNum[i] = 7;
                }
            }
            for (char ch : seven) {
                if (ch == input[i].charAt(0)) {
                    inputNum[i] = 8;
                }
            }
            for (char ch : eight) {
                if (ch == input[i].charAt(0)) {
                    inputNum[i] = 9;
                }
            }
            for (char ch : nine) {
                if (ch == input[i].charAt(0)) {
                    inputNum[i] = 10;
                }
            }
            if (input[i] == "0") {
                inputNum[i] = 1;
            }
        }

        for (int i : inputNum) {
            result += i;
        }

        System.out.println(result);
        br.close();
    }
}