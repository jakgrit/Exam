import java.util.Scanner;
public class Loop37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<cnt;j++)    System.out.print("A");
            for(int j=cnt;j<n;j++)    System.out.print("-");
            for(int j=cnt;j<n;j++)    System.out.print("-");
            for(int j=0;j<cnt;j++)    System.out.print("A");
            
            System.out.println();
            cnt++;
        }
        cnt = n-1;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<cnt;j++)    System.out.print("A");
            for(int j=cnt;j<n;j++)    System.out.print("-");
            for(int j=cnt;j<n;j++)    System.out.print("-");
            for(int j=0;j<cnt;j++)    System.out.print("A");
            
            System.out.println();
            cnt--;
        }
    }
}
