import java.util.Scanner;
public class Loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            sum = Math.pow(a, a);
           System.out.printf("%.0f\n",sum);
        }
    }
}
