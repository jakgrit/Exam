import java.util.Scanner;
public class Loop9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double sum = 0;
        for(double i=1;i<=a;i++){
            sum += 1/i;
        }
        System.out.printf("%.4f\n",sum);
    }
}
