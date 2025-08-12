public class j4 {
    public static void main(String[] args) {
        // Simulate clearing screen by printing several new lines
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        int number = 527;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
