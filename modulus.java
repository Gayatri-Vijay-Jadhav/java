import java.util.Scanner;
public class modulus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a;
    System.out.print("enter a number: ");
    a = sc.nextInt();
    
    if ( a % 5 == 0) {
        System.out.println("Number is Divisible by 5: ");
    }
    else{
        System.out.println("Number is not Divisible by 5: ");
    }

    }
}