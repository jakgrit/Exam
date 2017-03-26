import java.util.Scanner;
public class Loop19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String[] s = {"You choose Apple","You choose Papaya","You choose Banana","You choose Orange","Bye Bye"};
        int[] v = {100,120,200,60};
        while(true){
            int x = sc.nextInt();
            System.out.println(s[x-1]);            
            if(x == 5)  break;
            sum += v[x-1];
        }
        System.out.println("Total Calories: " + sum);
    }
}
