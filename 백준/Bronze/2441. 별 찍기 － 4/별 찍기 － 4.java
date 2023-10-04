import java.io.*;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        
        for(int i = 0; i< cnt; i++){
            for(int j = 0; j< cnt; j++){
                if(j < i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
