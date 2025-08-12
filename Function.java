import java.util.Scanner;
public class Function{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ");
        double a  = sc.nextInt();
        System.out.print("Enter a ");
        double b  = sc.nextInt();
        System.out.println("Power:  "+Math.pow(a,b));
        System.out.println("Square Root: "  +Math.sqrt(a));
        System.out.println("Area Of Crircle:  "+Math.PI * (a*a) );
            }
}