import java.util.Scanner;
public class Factor{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
           if(n % i == 0)
            System.out.println(i);
        }
    }
}