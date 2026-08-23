import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() ;
        for(int i = 0 ; i < n ; i++){
            String s = scan.next();
            int len = s.length();
            if(len > 10){
                System.out.println("" + s.charAt(0) + (len -2) + s.charAt(len -1 ));
            }
            else{
                System.out.println(s);
            }
        }
        scan.close(); 
    }
}