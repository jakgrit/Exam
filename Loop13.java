import java.util.Scanner;
public class Loop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt();
        int x;
        int cnt = 0,max = 0;
        while(true){
            x = sc.nextInt();
            if(x == 0)  break;                          
            
            if(x == s){
                cnt++;
                max = max<cnt?cnt:max;
            }
            else cnt = 0;
        }     
        System.out.println(max);
    }
}
