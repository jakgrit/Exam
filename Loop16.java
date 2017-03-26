import java.util.Scanner;
public class Loop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];
        boolean win = false;
        int cnt = 0;
        for(int i=0;i<10;i++){
            for(int j=0;j<4;j++){
                x[j] = sc.nextInt();
                String tmp = subAns(x[j],j);
                System.out.print(j==0?tmp:" "+tmp);
            }
            System.out.println();
            cnt++;
            if(cheack(x)){
                win = !win;
                break;
            }
        }
        System.out.println(win?"You win!! You spend "+cnt+" tries.":"You lose!! You spend "+cnt+" tries.");
    }
    public static boolean cheack(int[] x){
        int[] tmp = {1,3,5,7};
        for(int i=0;i<x.length;i++){
            if(x[i] != tmp[i]) return false;
        }
        return true;
    }
    public static String subAns(int x,int p){
        int[] tmp = {1,3,5,7};
        if(x == tmp[p]) return String.valueOf(x) + "/";
        for(int i=0;i<4;i++) if(x == tmp[i]) return String.valueOf(x) + "x";
        return "-";
    }
}
