import java.util.*;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        int [] arr = new int[N];
        
        for (int i = 0; i< N; i++){
            int ran = sc.nextInt();
            arr[i] = ran;
        }
        
        for (int j = 0; j< arr.length; j++){
            if(arr[j] < X) {
                System.out.printf("%d ",arr[j]);
            }
        }
    }
}