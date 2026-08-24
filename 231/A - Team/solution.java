import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = scan.nextInt() + scan.nextInt() + scan.nextInt();
            if (sum >= 2) {
                ans++;
            }
        }
        System.out.println(ans);
        scan.close();
    }
 
}