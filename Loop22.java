import java.util.Scanner;
public class Loop22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String a="",b="";
        for(int i=0;i<x;i++){
            a += ">";
            b += "<";
        }
        for(int i=0;i<x;i++){
            System.out.println(i%2==0?a+" "+b:b+" "+a);
        }
    }
}
