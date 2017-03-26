import java.util.Scanner;
public class Loop32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==1 || i == a || j == 1 || j == a){
                    System.out.print(j == 1?i:" "+i);
                }else{
                    System.out.print(" -");
                }
            }
            System.out.println();
        }
    }
}
