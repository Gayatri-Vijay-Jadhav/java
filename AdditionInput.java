import java.util.Scanner;
public class AdditionInput{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter value of a: ");
        a = sc.nextInt();
        System.out.print("Enter value of b: ");
        b = sc.nextInt();
        System.out.println("addition of two numbers: "+(a+b));
    }
}