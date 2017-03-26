import java.util.Scanner;
public class Loop40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0,tmp = 0;
        for(int i=0;i<a;i++){            
            for(int j=0;j<b;j++){
                if(i%2 == 0)    System.out.print(j==0?(++cnt):" "+(++cnt));
                else    System.out.print(j==0?--tmp:" "+(--tmp));
            }
            System.out.println();
            if(i%2 == 0)    tmp = cnt+b+1;
            else    cnt = tmp+b-1;
        }
    }
}
