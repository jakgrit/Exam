import java.util.Scanner;
public class Loop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String ans = "";
        for(int i=(a.length()-1);i>=0;i--){
         System.out.print(a.charAt(i));
        }
    }
}
