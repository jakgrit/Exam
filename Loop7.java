import java.util.Scanner;
public class Loop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=n;i>=0;i--){
            if(i%10 ==0 ){
                sum = i;
                System.out.print(sum+" ");
            }else continue;
        }
    }
}
