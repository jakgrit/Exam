import java.util.Scanner;
public class Loop31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i==0 || i == a-1 || j == 0 || j == a-1){
                    System.out.print(j == 0?"*":" *");
                }else{
                    System.out.print(" -");
                }
            }
            System.out.println();
        }
    }
}
