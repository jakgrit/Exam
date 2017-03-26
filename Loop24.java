import java.util.Scanner;
public class Loop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String x = "",y = "";
        for(int i=0;i<b;i++){
            x += "+";
            y += i==0||i==(b-1)?"+":"-";
        }
        for(int i=0;i<a;i++){            
            System.out.println(i==0||i==(a-1)?x:y);
        }
    }
}
