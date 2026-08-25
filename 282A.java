
import java.util.Scanner;

public class bitpp {
    public static void main(String[] args) {
        int x = 0 ;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0 ; i < n ; i++){
           String in = scan.next();
            if (in.contains("+")) {
                x++;
            } 
            // Check for any form of decrement (e.g., "--X" or "X--")
            else if (in.contains("-")) {
                x--;
            }
              
        }
        System.out.println(x);
        scan.close();

    }
}
