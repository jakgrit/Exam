import java.util.Scanner;
public class Loop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int cnt = 0;
        int cnt2 = 0;
        for(int i=0;i<10;i++){
            a = sc.nextInt();
            if(a==-1)break;
            else if(a>60) cnt++;
            else cnt2++;
        }
        System.out.println(cnt);
        System.out.println(cnt2);
    }
}
