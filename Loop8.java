import java.util.Scanner;
public class Loop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a =' ';
        int cnt = 0;
        while(true){
            a = sc.next().charAt(0);
            if(a=='q')break;
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')cnt++;
            System.out.printf("%c\n",a-32);
        }
        System.out.println(cnt);
    }
}
