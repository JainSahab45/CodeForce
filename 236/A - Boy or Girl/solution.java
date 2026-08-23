import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
 
        boolean[] arr = new boolean[26];
        for(int i = 0 ; i < s.length() ; i++){
            int j = s.charAt(i) - 'a';
            arr[j] = true ;
        }
        int count = 0 ;
        for(int i = 0 ;  i < 26; i++ ){
            if(arr[i]){
                count++ ;
            }
        }
        if(count % 2 != 0 ){
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println( "CHAT WITH HER!");
        }
        sc.close();
    }
}
 
 