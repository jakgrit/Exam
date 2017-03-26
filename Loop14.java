import java.util.Scanner;
public class Loop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b){
                sum += a;
                System.out.print(i==0?a:" + "+a);
            }
            else{
                sum += b ;
                System.out.print(i==0?b:" + "+b);
            }
        }
        System.out.println(" = "+sum);
    }
}
