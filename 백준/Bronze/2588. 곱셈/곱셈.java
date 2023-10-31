import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(Integer.parseInt(A)*Integer.parseInt(String.valueOf(B.charAt(2))));
        System.out.println(Integer.parseInt(A)*Integer.parseInt(String.valueOf(B.charAt(1))));
        System.out.println(Integer.parseInt(A)*Integer.parseInt(String.valueOf(B.charAt(0))));
        System.out.println(Integer.parseInt(A)*Integer.parseInt(B));
    }
}