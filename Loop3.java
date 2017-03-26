import java.util.Scanner;
public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double sum = 0;
        for(int i=1;i<=a;i++){
            sum += Math.pow(i, 2);
        }
        System.out.printf("%.0f\n",sum);
    }
}
