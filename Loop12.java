import java.util.Scanner;
public class Loop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int max = 0; 
        int max2 = 1;        
        while(true){
            if(a<=0) break;
            a = sc.nextInt();
            if(a%2==0){
                if (max < a) max = a;
            }else{
                if (max2 < a) max2 = a;
            }
        }
        System.out.println(max2);
        System.out.println(max);
        System.out.println(Math.abs(max-max2));
    }
}
