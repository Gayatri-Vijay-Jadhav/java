import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        final double PI = 3.14159; // Constant for Pi

        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextDouble();

        double area = PI * radius * radius; // Area formula: πr²
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}