
import java.util.Scanner;

public class nextround {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] p = new int[n];
        int c = 0;
        for(int i = 0 ; i < n ;i++){
            p[i] = scan.nextInt();
        }
        int thresholdScore = p[k - 1];
        for(int i = 0 ; i < n ;i++){
            if(p[i] >= thresholdScore && p[i] > 0){
                c++; 
            }
        }
        System.out.println(c);
        scan.close();
    }
}
