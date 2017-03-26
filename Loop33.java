import java.util.Scanner;
public class Loop33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n+(n-1);
        for(int i=n;i>=1;i--){
            for(int j=0;j<n-i;j++) System.out.print("-");
            for(int j=0;j<cnt;j++) System.out.print("*");
            for(int j=0;j<n-i;j++) System.out.print("-");
            System.out.println();
            cnt -= 2;
        }
    }
}
