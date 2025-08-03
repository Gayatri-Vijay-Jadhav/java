import java.util.Scanner;
public class InputFor {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:"); 
        String name = scanner.nextLine();
        System.out.println("Enter the number of times to print your name:");
        int count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println(i + " " + name);
        }
        scanner.close();
    }
}