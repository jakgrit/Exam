import java.util.Scanner;
public class Loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int cnt1 = 0;
        int cnt2 = 0;
        while(a!=-1){
            a = sc.nextInt();
            if(a%2 == 0) cnt2++;
            else cnt1++;
        }
        System.out.println(cnt1-1);
        System.out.println(cnt2);
    }
}
