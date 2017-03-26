import java.util.Scanner;
public class Loop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ans = "";
        for(int i=1;i<=a;i++){
            if(i%5==0) ans = "X";
            else ans = "*";
            System.out.print(ans);
        }
    }
}
