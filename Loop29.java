import java.util.Scanner;
public class Loop29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=a;i>=1;i--){
          for(int j=1;j<=a;j++){
            System.out.print(i+" ");  
          }
           System.out.println(); 
        }
    }
}
