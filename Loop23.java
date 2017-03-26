import java.util.Scanner;
public class Loop23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=0;j<b;j++){
                for(int f=1;f<b;f++){
                    System.out.print(i);
                }
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
