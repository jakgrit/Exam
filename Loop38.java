import java.util.Scanner;
public class Loop38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++) System.out.print("-");
            for(int j=0;j<cnt;j++) System.out.print("*");
            for(int j=0;j<n-i-1;j++) System.out.print("-");
            System.out.println();
            cnt += 2;
        }
        cnt = n+(n-1)-2;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<n-i;j++) System.out.print("-");
            for(int j=0;j<cnt;j++) System.out.print("*");
            for(int j=0;j<n-i;j++) System.out.print("-");
            System.out.println();
            cnt -= 2;
        }
    }
}
