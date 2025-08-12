import java.util.Scanner;
public class f2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number:");
        int a = sc.nextInt();
        System.out.println("Enter exponent:");
        int b = sc.nextInt();

        int power = (int) Math.pow(a, b);  // Cast double to int

        System.out.println("Result: " + power);
    }
}
