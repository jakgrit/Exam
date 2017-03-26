import java.util.Scanner;   
public class Loop20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=0;j<a;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
