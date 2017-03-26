import java.util.Scanner;
public class Loop39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a ={ "...*...","..*.*..",".*...*.","*.....*"};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<n;j++){
                 System.out.print(a[i]);
            }
            System.out.println();
        }
    }
}
