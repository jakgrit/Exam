import java.util.Scanner;
public class Loop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++)
            System.out.print("*");
        System.out.println();
        for(int i=0;i<a-2;i++)
            System.out.print("*");
        System.out.println();
        for(int i=0;i<a-4;i++)
            System.out.print("*");
        System.out.println();
    }
}
