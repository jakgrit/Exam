import java.util.Scanner;
public class Loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int sum = 0;
        for(int i=a;i<=b;i++){
           if(i%2!=0){ 
                c = i;
                sum += c;
                System.out.print(c+" ");
           }else
               continue;        
       }
        System.out.println();
        System.out.println(sum);
    }
}
