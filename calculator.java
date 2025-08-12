import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, option, ex = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nEnter your choice from the following menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            option = sc.nextInt();

            if (option == 5) {
                System.out.println("You chose to exit. Goodbye!");
                break;
            }

            if (option < 1 || option > 5) {
                System.out.println("Invalid choice. Please select a valid option.");
                continue;
            }

            System.out.print("Enter the first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        System.out.println("Division of " + num1 + " by " + num2 + " is " + (num1 / num2));
                        System.out.println("Remainder is " + (num1 % num2));
                    }
                    break;
            }

            System.out.println("\nDo you want to continue?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Your choice: ");
            ex = sc.nextInt();

        } while (ex == 1);

        sc.close();
    }
}
